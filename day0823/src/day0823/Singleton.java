package day0823;

public class Singleton {
	
	
	//2.
	//Singleton single = new Singleton();
			
	//3.
	//private Singleton single = new Singleton();
	
	//5.
	//싱글톤 : 인스턴스가 딱 1개만 생성되어야 하는 경우에 사용
	private static Singleton single = new Singleton();
	
	//1.
	//다른 클래스에서 객체 생성을 하지 못하도록 생성자를 private로 설정
	private Singleton(){}
	
	//4.
	//생성된 객체를 사용하기 위한 메서드
	static Singleton getInstance() {
		return single;
	}
}
