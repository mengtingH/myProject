package mt.util;

import mt.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import freemarker.template.utility.StringUtil;

public class CastUtil {
	
	private static Logger log = LoggerFactory.getLogger(CastUtil.class);

	/**
	 * 转string
	 * @param obj
	 * @return
	 */
	public static String castString(Object obj) {
		return CastUtil.castString(obj,"");
	}
	
	/**
	 * 转string（提供默认值）
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static String castString(Object obj,String defaultValue) {
		return obj != null?String.valueOf(obj):defaultValue;
	}
	
	/**
	 * 转double
	 * @param obj
	 * @return
	 */
	public static double castDouble(Object obj) {
		return CastUtil.castDouble(obj,0);
	}
	
	/**
	 * 转double(提供默认值)
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static double castDouble(Object obj,double defaultValue) {
		double value = defaultValue;
		if(obj!=null){
			String strValue = castString(obj);
			if(StringUtils.isNotEmpty(strValue)){
				try {
					value = Double.parseDouble(strValue);
				} catch (NumberFormatException e) {
					value = defaultValue;
				}
			}
		}
		return value;
	}
	
	/**
	 * 转long
	 * @param obj
	 * @return
	 */
	public static long castLong(Object obj) {
		return CastUtil.castLong(obj,0);
	}
	
	/**
	 * 转long(提供默认值)
	 * @param obj
	 * @return
	 */
	public static long castLong(Object obj,long defaultValue) {
		long longValue = defaultValue;
		if(obj!=null){
			String strValue = castString(obj);
			if(StringUtils.isNotEmpty(strValue)){
				try {
					longValue = Long.parseLong(strValue);
				} catch (Exception e) {
					longValue = defaultValue;
				}
			}
		}
		return longValue;
	}
	
	public static int castInt(Object obj) {
		return CastUtil.castInt(obj,0);
	}
	
	/**
	 * 转int(提供默认值)
	 * @param obj
	 * @return
	 */
	public static int castInt(Object obj,int defaultValue) {
		int intValue = defaultValue;
		if(obj!=null){
			String strValue = castString(obj);
			if(StringUtils.isNotEmpty(strValue)){
				try {
					intValue = Integer.parseInt(strValue);
				} catch (Exception e) {
					intValue = defaultValue;
				}
			}
		}
		return intValue;
	}
	
	public static boolean castBoolean(Object obj) {
		return CastUtil.castBoolean(obj,false);
	}
	
	/**
	 * 转boolean(提供默认值)
	 * @param obj
	 * @return
	 */
	public static boolean castBoolean(Object obj,boolean defaultValue) {
		boolean booleanValue = defaultValue;
		if(obj!=null){
			booleanValue = Boolean.parseBoolean(castString(obj));
		}
		return booleanValue;
	}
}
