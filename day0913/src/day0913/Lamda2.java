package day0913;

@FunctionalInterface
interface Calculator{
	void sum (int x, int y);
}

public class Lamda2 {
	
	public  static void action (Calculator calculator) {
		int x = 10;
		int y = 2;
		calculator.sum(x, y);
	}
	
	public static void main(String[] args) {
		action((x , y) ->{
			int result = x+y;
			System.out.println(result);
		});
	
	}
}
