package day0829;

interface OperateCar1{
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
	default void fly() {
		System.out.println("하늘을 날아요");
	}
}

class OldCar implements OperateCar1{

	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turn(int degree) {
		// TODO Auto-generated method stub
		
	}
	
}

public class DefalutMethod1 {

	public static void main(String[] args) {
		OldCar o1 = new OldCar();
		o1.turn(20);
		o1.fly();
	}
}
