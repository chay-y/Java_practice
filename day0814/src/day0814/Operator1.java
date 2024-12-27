package day0814;

public class Operator1 {
	public static void main(String[] args) {
		double d = 0.1f;
		System.out.println(d);
		
		double c =0.1;
		System.out.println(c);
		
		System.out.println("------------------");
		
		int num = 518;
		int num1 = num/100;
		int num2 = num/10-num1*10;
		int num3 = num-(num1*100+num2*10);
		System.out.println(num1+num2+num3);
		
		int n1 = num % 10;
		int n2 = num / 10 % 10;
		int n3 = num / 100 % 10;
		System.out.println(n1+n2+n3);
	}
}
