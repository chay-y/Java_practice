package Day0912;

public class Baker implements Runner{
	public Baker(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			buffer.put(i);
			System.out.println("제빵사 : "+i+"번째 케익을 생산함");
		
			try {
				Thread.sleep((int)(Math.random()*100));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Buffer {

	private int cake;
	
	//케익이 없으면 true(손님이 기다리고 있음)
	//케익이 있으면 false(가게가 케익이 팔리기를 기다리고 있는 상태)
	private boolean empty = true;
	
	//케익을 생성하는 메서드
	public void put(int cake) {
		empty = false;
		this.cake=cake;
	}
	
	//케익을 구매하는 메서드
	public synchronized int get() {
		
		while(empty){
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty = false;
		notifyAll();
		return cake;
	}
}
