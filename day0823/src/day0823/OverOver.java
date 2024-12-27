package day0823;

class Parent{
	void Print() {
		System.out.println("부모 클래스의 Print()메서드입니다.");
	}
}

class Child extends Parent{
	//오버라이딩
	void Print() {		
		System.out.println("부모 클래스의 Print()메서드입니다.");}
	//오버로딩
	void Print(String child) {
		System.out.println(child);
	}
}

public class OverOver {

	public static void main(String[] args) {
		Child ch = new Child();
		
		ch.Print();
		ch.Print("오버로딩된 print()메서드");
	}
}
