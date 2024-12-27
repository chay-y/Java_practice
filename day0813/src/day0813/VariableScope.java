package day0813;

public class VariableScope {
	public static void main(String[] args) {
		
		/* 전역변수 */
		int v1 = 15;
		// int v2 = 0;
		
		if(v1 > 10) {
			
			/* 지역변수 */
			int v2;
			v2 = v1 - 10;
			System.out.println("v2 : "+v2);
		}
		
		// int v3 = v1 + v2 + 5;
		// System.out.println("v3 : "+v3);
		
		System.out.println("----------------");
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
			if (true) {
				num1 = 1;
				num2 = 2;
				num3 = 3;
			}
			num1 = num2+num3;
		}
//		num1 = num2 +num3;
	}
