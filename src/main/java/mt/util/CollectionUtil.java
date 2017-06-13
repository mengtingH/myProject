package mt.util;

import java.util.Collection;
import java.util.Map;

public class CollectionUtil {
	
	public static boolean isEmpty(Collection<?> collection){
		return CollectionUtil.isEmpty(collection);
	}
	
	/**
	 * ÅÐ¶ÏCollectionÊÇ·ñÎª¿Õ
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
	 * ÅÐ¶ÏMapÊÇ·ñÎª¿Õ
	 * @param map
	 * @return
	 */
	public static boolean isNotEmpty(Map<?, ?> map){
		return !isEmpty(map);
	}
	
	
	
}
