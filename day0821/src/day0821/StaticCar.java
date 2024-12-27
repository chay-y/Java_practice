package day0821;

public class StaticCar {

	public static void main(String[] args) {
		CarS c1 = new CarS();
		c1.setCars(1234, 10.2);
		c1.showS();
		CarS.showSum();
		
		CarS c2 = new CarS();
		c2.setCars(5678, 20.2);
		c2.showS();
		CarS.showSum();
	}

}
