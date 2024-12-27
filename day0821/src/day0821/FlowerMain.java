package day0821;

public class FlowerMain {

	public static void main(String[] args) {
		Flower f1 = new Flower("장미", 1500);
		Flower f2 = new Flower("튤립", 2000);
		Flower f3 = new Flower();
	
		f1.flowerInfo();
		f2.flowerInfo();
		f3.flowerInfo();
	}
}
