package day0823;

public class SingleTestMain {

	public static void main(String[] args) {
		SingleTest t = SingleTest.getSingleTest();

		System.out.println("x : "+t.getX());
		System.out.println("y : "+t.getY());
		
		SingleTest t1 = SingleTest.getSingleTest();
		SingleTest t2 = SingleTest.getSingleTest();
		
		t1.setX(100);
		
		System.out.println("x : "+t.getX());
		System.out.println("y : "+t.getY());
	}
}
