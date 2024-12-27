package day0911;

class ThreadEx extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=10;i++) {
			System.out.println(i+" ");
		}
	}
	System.out.println(System.currentTimeMillis()-UsingThreadProcess.start()));	
}

public class UsingThreadProcess {

	public static void main(String[] args) {
		ThreadEx th1 = new ThreadEx();
	
	}
}
