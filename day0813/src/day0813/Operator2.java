package day0813;

public class Operator2 {
	public static void main(String[] args) {
		
		char ch1 = 'A';  //65
		char ch2 = 'B';  //66
		
		System.out.println(ch1<ch2);
		
		float num1 = 0.1f;
		double num2 = 0.1;
		System.out.println(num1 == (float)num2);
		
		int num3 = 1;
		double num4 = 1.0;
		System.out.println(num3 == num4);
		
		System.out.printf("%.15f \n", num1);
		System.out.printf("%.15f \n", num2);
	}
}
