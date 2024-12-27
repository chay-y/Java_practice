package day0829;

interface Drive1{
	
	void drive();
}

interface Fly1{
	void fly();
	void drive();
}

class FlyingCar implements Drive1, Fly1{
	@Override
	public void fly() {
		System.out.println("하늘을 날아요..");
	}
	@Override
	public void drive() {
		System.out.println("도로를 달려요..");
	}
	
}

public class FlyingCar1 {

	public static void main(String[] args) {
		FlyingCar fc = new FlyingCar();
		
		fc.fly();
		fc.drive();
	}
}
