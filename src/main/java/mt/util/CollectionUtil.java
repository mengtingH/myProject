package mt.util;

import java.util.Collection;
import java.util.Map;

public class CollectionUtil {
	
	public static boolean isEmpty(Collection<?> collection){
		return CollectionUtil.isEmpty(collection);
	}
	
	/**
	 * �ж�Collection�Ƿ�Ϊ��
	 * @param collection
	 * @return
	 */
	public static boolean isNotEmpty(Collection<?> collection){
		return !isEmpty(collection);
	}
	
	public static boolean isEmpty(Map<?, ?> map){
		return CollectionUtil.isEmpty(map);
	}
	
	/**
	 * �ж�Map�Ƿ�Ϊ��
	 * @param map
	 * @return
	 */
	public static boolean isNotEmpty(Map<?, ?> map){
		return !isEmpty(map);
	}
	
	
	
}
