package day0826;

class Vehicle{
	void run() {
		System.out.println("차량이 달려요");
	}
}

class Bus extends Vehicle{
	void run() {
		System.out.println("버스가 달려요");
	}
}

class Taxi extends Vehicle{
	void run() {
		System.out.println("택시가 달려요");
	}
}

class Driver{
	
	void drive(Vehicle v) {
		v.run();
	}
//	void drive(Bus b) {
//		b.run();
//	}
//	void drive(Taxi t) {
//		t.run();
//	}
}

public class DriverExample {

	public static void main(String[] args) {
		
		Driver dr = new Driver();
		
		Bus b = new Bus();
		dr.drive(b);
		
		Taxi t = new Taxi();
		dr.drive(t);
	}
}
