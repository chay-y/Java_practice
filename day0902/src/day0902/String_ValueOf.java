package day0902;

public class String_ValueOf {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(100);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		System.out.println(iVal + dVal);
		System.out.println(strVal + strVal2);
		
		double sum1 = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		System.out.println(sum1);
		System.out.println(sum2);
		
		String strVal3 = "a,b,c";
		String[] arr = strVal3.split(",");
		
		System.out.println(arr[0].trim());
		System.out.println(arr[1].trim());
		System.out.println(arr[2].trim());
	}
}
