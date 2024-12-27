package day0829;

public class Exception1 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
			System.out.println("AA");
		}catch(Exception e) {
			System.out.println("오류");
		}
		finally {
			System.out.println(6);
		}
		
	}
}
