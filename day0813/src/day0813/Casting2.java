package day0813;

public class Casting2 {
	public static void main(String[] args) {
		
		int intValue = 100;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 100;
		intValue = (int)longValue; 
		System.out.println(intValue);
		
		//실수는 정수로 자동형변환 불가
		double doubleValue = 12.23;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}
}
