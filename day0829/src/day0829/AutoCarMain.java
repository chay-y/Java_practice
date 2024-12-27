package day0829;

interface OperaterCar{
	//public == 모든 클래스에서 접근해서 사용할 수 있어야 하기 때문
	//static == 인터페이스는 객체를 생성할 수 없음(추상클래스이기 때문에)
	// -> 인터페이스에 선언한 변수가 인스턴스 변수가 될 수 없으므로 클래스 변수로 사용해야함.
	String COLOR = "white";
	
	public void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
}

class AutoCar implements OperaterCar{
	
	@Override
	public void start() {
		System.out.println("자동차가 출발합니다..");
	}
	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	@Override
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를"+speed+"로 설정합니다.");
	}
	@Override
	public void turn(int degree) {
		System.out.println("자동차가 방향을"+degree+"만큼 회전합니다.");
	}
}

public class AutoCarMain {
	public static void main(String[] args) {
		AutoCar a = new AutoCar();
		
		a.start();
		a.setSpeed(30);
		a.turn(15);
		a.start();
	}
	
}
