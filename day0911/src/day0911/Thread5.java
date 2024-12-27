package day0911;

class Inter extends Thread{
	@Override
	public void run() {
		System.out.println("sleep...");
		
		try {
			Thread.sleep(1000*10);
		}catch(InterruptedException e) {
			System.out.println("wake up!");
			e.printStackTrace();
		}
		for(int i=0; i<=10;i++) {
			System.out.println(i+" ");
		}
	}
}

public class Thread5 {

	public static void main(String[] args) {
		Thread t1 = new Inter();
		
		t1.start();
	}
}
