package day0829;

class A{
	public void methodA1(B b) {
		b.methodB();
	}
}

class B{
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class InterfaceTest {
	
	public static void main(String[] args) {
	
		A a =new A();
		a.methodA(new B());
}
}
