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
	 * ���������ļ�
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
	 * ��ȡ�ַ��������ԣ�Ĭ��ֵΪ���ַ�����
	 * @param properties
	 * @param key
	 * @return
	 */
	public static String getString(Properties properties,String key) {
		return getString(properties, key,"");
	}
	
	/**
	 * ��ȡ�ַ��������ԣ���ָ��Ĭ��ֵ��
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
	 * ��ȡ�����������ԣ�Ĭ��ֵΪ0)
	 * @param properties
	 * @param key
	 * @return
	 */
	public static int getInt(Properties properties,String key) {
		return getInt(properties, key,0);
	}
	
	/**
	 * ��ȡ�����������ԣ���ָ��Ĭ��ֵ��
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
	 * ��ȡboolean�������ԣ�Ĭ��ֵΪfalse)
	 * @param properties
	 * @param key
	 * @return
	 */
	public static boolean getBoolean(Properties properties,String key) {
		return getBoolean(properties, key,false);
	}
	
	/**
	 * ��ȡboolean�������ԣ���ָ��Ĭ��ֵ��
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
