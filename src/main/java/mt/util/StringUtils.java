package mt.util;


public class StringUtils {
	
	
   /**
 * @param str
 * @return
 */
	public static boolean isEmpty(String str){
		   if(str!=null){
			   str = str.trim();
		   }
		   
		   return StringUtils.isEmpty(str);
	   }
	
	public static boolean isNotEmpty(String str){
		   return !isEmpty(str);
	   }
}
