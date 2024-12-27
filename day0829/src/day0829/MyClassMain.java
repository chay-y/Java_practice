package day0829;

class MyClass{
	//1.인터페이스가 필드타입으로 사용
	RemoteControl rc = new Televison();
	
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		this.rc=rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//3.인터페이스가 지역변수 타입으로 사용
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
	}
		
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(33);
	}
	
	
}


public class MyClassMain {

	public static void main(String[] args) {
		
		System.err.println("1.-----------------------");
		
		MyClass myClass1 = new MyClass();
		
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(2);
		
		System.err.println("2.-----------------------");
		
		MyClass myClass2 = new MyClass();
		
		System.err.println("3.-----------------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.err.println("4.-----------------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		
		
}
}
