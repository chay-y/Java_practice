package day0813;

public class Calculator {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 50;
		
//		printf ; 
		
//		정수 : %d
//		실수 : %f
//		문자열 : %s
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
		
		System.out.printf("%d + %d = %d \n", num1, num2, (num1+num2));
		System.out.printf("%d - %d = %d \n", num1, num2, (num1-num2));
		System.out.printf("%,d * %,d = %,d \n", num1, num2, (num1*num2));
		System.out.printf("%d / %d = %d \n", num1, num2, (num1/num2));
		
	}
}
