package day0822;

class A2{
	int num1;
	int num2;
	
	String pirnt() {
		return "num1 : "+num1+", num2 : "+num2;
	}
}

class B2 extends A2{
	int num3;
	String pirnt() {
		return "num1 : "+num1+", num2 : "+num2+" num3 : "+num3;
	}
}

public class OverMain2 {

	public static void main(String[] args) {
		B2 bb=new B2();
		bb.num1 = 10;
		bb.num2 = 20;
		bb.num3 = 30;
		
		System.out.println(bb.pirnt());
	}
}
