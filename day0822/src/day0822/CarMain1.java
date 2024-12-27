package day0822;

public class CarMain1 {

	public static void main(String[] args) {
		
		Car1 c1 = new Car1();
		System.out.println("c1.color : "+c1.color);
		System.out.println("c1.gearType : "+c1.gearType);
		System.out.println("c1.door : "+c1.door);

		Car1 c2 = new Car1("black");
		System.out.println("c1.color : "+c2.color);
		System.out.println("c1.gearType : "+c2.gearType);
		System.out.println("c1.door : "+c2.door);
		
		Car1 c3 = new Car1("orange","auto",8);
		System.out.println("c1.color : "+c3.color);
		System.out.println("c1.gearType : "+c3.gearType);
		System.out.println("c1.door : "+c3.door);
	}
}
