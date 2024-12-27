package day0813;

public class Operator3 {
	public static void main(String[] args) {
		int n = 10;
		
		int leftN = n << 2;
		int rightN = n >> 2;
		
		System.out.println(leftN);
		System.out.println(rightN);
		
		byte a = 10;
		System.out.println(~a);
		
		int x = 1000000;
		int y = 1000000;
		
		long c = (long)x * y;
		System.out.println(c);
	}
}
