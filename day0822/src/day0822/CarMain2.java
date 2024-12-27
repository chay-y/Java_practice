package day0822;

public class CarMain2 {

	public static void main(String[] args) {
		
		Car1 c1 = new Car1();
		Car1 c2 = new Car1(c1);
		
		c1.door = 100;
		
		System.out.println("c1.color : "+c1.color);
		System.out.println("c1.gearType : "+c1.gearType);
		System.out.println("c1.door : "+c1.door);

		System.out.println("c1.color : "+c2.color);
		System.out.println("c1.gearType : "+c2.gearType);
		System.out.println("c1.door : "+c2.door);
		
		
	}
}
