package Day0912;

public class CakeMain {

	public static void main(String[] args) {
		Buffer buffer = new buffer();
		
		Baker b = new Baker(buffer);
		Thread t1 = new Thread(b);
		t1.start();
		
	}
}
