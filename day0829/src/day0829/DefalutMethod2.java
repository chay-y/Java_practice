package day0829;

interface MyInterface{
	
	void myMethod1();
	
	default void myMethod2() {
		System.out.println("myMethod2()");
		myMethod4();
	}
	
	
	static void myMethod3() {
		System.out.println("MyInterface-static 메서드");
		myMethod4();
	}
	
	private static void myMethod4() {
		System.out.println("MyInterface-private 메서드");
	}
}

interface MyInterface2{
	
	void myMethod1();
	
	default void myMethod2() {
		System.out.println("MyInterface2 - myMethod2()");
	}
}

class MyClass1{
	public void myMethod2() {
		System.out.println("MyClass1 - myMethod2");
	}
	
}


public class DefalutMethod2 extends MyClass implements MyInterface, MyInterface2{
	
	@Override
	public void myMethod1() {
		System.out.println("myMethod1()");
	}
	
	@Override
	public void myMethod2() {
		System.out.println("오버라이딩한 myMethod2");
	}
	
	public static void main(String[] args) {
		DefalutMethod2 obj = new DefalutMethod2();
		
		obj.myMethod1();
		obj.myMethod2();
		
		MyInterface.myMethod3();
//		obj.myMethod4();
	}
}
