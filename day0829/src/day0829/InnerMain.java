package day0829;

class A1{
	A1(){
		System.out.println("A객체가 생성됨");
	}
	
	//중첩클래스, 내부클래스
	class B1{
		B1(){
			System.out.println("B객체가 생성됨");
		}
		
		int filed1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	static class C1{
		C1(){
			System.out.println("C객체가 생성됨");
		}
		int filed1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method(){
		class D1{
			D1(){
				System.out.println("D객체가 생성됨");
			}
			int filed1;
			static int field2;
			void method1() {}
			static void method2() {}
		}
		D1 d = new D1();
		d.filed1=3;
		d.method1();
	}
}

public class InnerMain {

	public static void main(String[] args) {
		A1 a = new A1();
		
		//인스턴스 멤버 클래스를 객체 생성
		A1.B1 b = a.new B1();
		b.field1 = 10;
		b.field2 = 20;
		b.method1();
		b.method2();
		
		A1.C1 c = new A1.C1;
		c.field1 = 10;
		c.field2 = 20;
		c.method1();
		c.method2();
	}
}

