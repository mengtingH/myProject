import java.text.DecimalFormat;


public class test {

	public static void main(String[] args) {
		float i = 4/9;
//		float  b   =  (float)(Math.round(i*100)/100);
		DecimalFormat decimalFormat=new DecimalFormat("0.00");
		String p=decimalFormat.format(i);
		System.out.println(i);
		
	}

}
