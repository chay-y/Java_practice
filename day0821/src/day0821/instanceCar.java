package day0821;

public class instanceCar {
	
	public static void main(String[] args) {
		CarI c1 = new CarI();
		
		c1.setCar(1234, 20.4);
		c1.showI();
		
		CarI c2 = new CarI();
		
		c2.setCar(5678, 10.2);
		c2.showI();
	}
}
