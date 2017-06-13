package mt.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropsUtil {
	
	private static Logger log = LoggerFactory.getLogger(PropsUtil.class);

	/**
	 * 加载属性文件
	 * @param fileName
	 * @return
	 */
	public static Properties loadProps(String fileName){
		
		Properties properties = null;
		InputStream is = null;
		try {
			is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
			
			if(is == null){
				throw new FileNotFoundException(fileName+"file is not find");
			}
			
			properties = new Properties();
			properties.load(is);
		} catch (Exception e) {
			log.error("load properties file failure",e);
		}finally{
			if(is != null){
				try {
					is.close();
				} catch (IOException e2) {
					log.error("close input stream failure",e2);
				}
			}
		}
		return properties;
		
	}
	
	
	/**
	 * 获取字符类型属性（默认值为空字符串）
	 * @param properties
	 * @param key
	 * @return
	 */
	public static String getString(Properties properties,String key) {
		return getString(properties, key,"");
	}
	
	/**
	 * 获取字符类型属性（可指定默认值）
	 * @param properties
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static String getString(Properties properties,String key,String defaultValue) {
		String value = defaultValue;
		if(properties.containsKey(key)){
			value = properties.getProperty(key);
		}
		return value; 
	}
	
	/**
	 * 获取数字类型属性（默认值为0)
	 * @param properties
	 * @param key
	 * @return
	 */
	public static int getInt(Properties properties,String key) {
		return getInt(properties, key,0);
	}
	
	/**
	 * 获取数字类型属性（可指定默认值）
	 * @param properties
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static int getInt(Properties properties,String key,int defaultValue) {
		
		int value = defaultValue;
		if(properties.containsKey(key)){
			value = Integer.parseInt(properties.getProperty(key));
		}
		return value;
	}
	
	/**
	 * 获取boolean类型属性（默认值为false)
	 * @param properties
	 * @param key
	 * @return
	 */
	public static boolean getBoolean(Properties properties,String key) {
		return getBoolean(properties, key,false);
	}
	
	/**
	 * 获取boolean类型属性（可指定默认值）
	 * @param properties
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static boolean getBoolean(Properties properties,String key,boolean defaultValue) {
		
		boolean value = defaultValue;
		if(properties.containsKey(key)){
//			value = Integer.parseInt(properties.getProperty(key));
		}
		return value;
	}
	
}
