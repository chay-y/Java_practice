package day0826;

class A{
	void A1(){
		System.out.println("A클래스");
	}
}

class B extends A{
	void B1(){
		System.out.println("B클래스");
	}
}



public class TypeTest1 {

	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		
		A ab=new B();
		
		//조상타입의 참조변수로 자손타입을 참조할 수 있다.
	}
}
