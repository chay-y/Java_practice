package Day0912;

public class Consumer implements Runnable{
	private Buffer;
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			int cake = buffer.get();
			System.out.println("손님 : "+i+"번재 케잌을 구매함");
			try {
				Thread.sleep((int)(Math.random()*100));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
