package day0829;

class A2{
	public void methodA1(I i) {
		i.methodB();
	}
}

interface I{
	public void methodB();
}

class B2 implements I{
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class InterfaceTest2 {
	
	public static void main(String[] args) {
	
		A2 a =new A2();
		a.methodA(new B2());
}
}