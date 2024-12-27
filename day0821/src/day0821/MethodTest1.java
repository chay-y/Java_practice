package day0821;

class Test2{
	//인스턴스 변수
	long a;
	long b;
	
	//인스턴스 메서드
	long add() {
		return a+b;
	}
	
	//지역변수 a, b
	static long add1(long a, long b) {
		return a+b;
	}
}

public class MethodTest1 {

	
	//클래스 매서드 내에서는
	//인스턴스변수와 인스턴스메서드를 호출할 수 없다.
	//그럼에도 인스턴스 멤버를 사용하고자 한다면
	//객체를 생성하고 호출하면 사용 가능함.
	public static void main(String[] args) {
		
		Test2 t = new Test2();
		t.a = 100;
		t.b = 200;
		System.out.println(t.add());
		
		System.out.println(Test2.add1(555, 666));
		
	}

}