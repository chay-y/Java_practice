package day0913;

@FunctionalInterface
interface TestFunction{
	void run();
}

public class Lambda3 {

	public static void main(String[] args) {
		
		TestFunction tf1 = () -> System.out.println("tf1.run()");
		
		tf1.run();
		
	}
}
