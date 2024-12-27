package day0830;

public class Throws1 {

	public static void main(String[] args) {
		try {
			method1();	
		}catch(Exception e) {
			System.out.println("main에서 예외처리 완료!");
		}
		
	}
	
	static void method1() throws Exception{
		method2();
	}
	
	static void method2() throws Exception{
		throw new Exception();	
	}
	
	
}
