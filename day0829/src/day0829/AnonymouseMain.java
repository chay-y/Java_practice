package day0829;

interface Remote{
	void turnOn();
	void turnOff();
}

public class AnonymouseMain {

	public static void main(String[] args) {
		Remote r = new Remote() {
			
			@Override
			public void  turnOn() {
				System.out.println("불키기");
			}
			@Override
			public void  turnOff() {
				System.out.println("불끄기");
			}
		};
		
		r.turnOn();
		r.turnOff();
	}
}
