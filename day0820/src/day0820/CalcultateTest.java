package day0820;

public class CalcultateTest {

	public static void main(String[] args) {
		Calculate cal = new Calculate();
		
		long result1 = cal.add(5L, 3L);
		long result2 = cal.subtract(5L, 3L);
		long result3 = cal.multiply(5L, 3L);
		double result4 = cal.devide(5, 3L);
		
		System.out.println("add(5L, 3L) : "+result1);
		System.out.println("subtract(5L, 3L) : "+result2);
		System.out.println("multiply(5L, 3L) : "+result3);
		System.out.println("devide(5L, 3L) : "+result4);
	}
}
