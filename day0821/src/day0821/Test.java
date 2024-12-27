package day0821;

public class Test {

	int iv; //인스턴스 변수
	static int cv; //클래스 변수
	
	void instanceMethod() {}
	static void staticMethod() {}

//	인스턴스 메서드 내에서는
//	다른 인스턴스변수, 클래스 변수, 인스턴스 메서드, 클래스 메서드를 모두 호출할 수 있다.
	void instanceMethod2() {
		System.out.println(iv);
		System.out.println(cv);
		instanceMethod();
		staticMethod();
	}
	
	static void instanceMethod3() {
		//System.out.println(iv);
		System.out.println(cv);
		//instanceMethod();
		staticMethod();
	}
}

public class MethodTest1{
	public static void main(String[] args) {
		Test t = new Test();
		
		t.instanceMethod();
		t.instanceMethod2();
		
		Test.staticMethod();
		Test.staticMethod();
		
	}
}