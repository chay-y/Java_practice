package day0822;

class A3 extends Object{
	int num1;
	int num2;
	
	public String toString() {
		return "num1 : "+num1+", num2 : "+num2;
	}
}

public class OverMain3 {

	public static void main(String[] args) {
		A3 aa = new A3();
		
		aa.num1 = 10;
		aa.num2 = 20;
		
//		System.out.println(aa.num1);
//		System.out.println(aa.num2);
		
		System.out.println(aa);
	}
}

