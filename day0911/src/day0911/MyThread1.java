package day0911;

public class MyThread1 extends Thread{

	//스레드가 실행하는 모든 작업은 run()안에 작성
		@Override
		public void run() {
			for(int i=0; i<=10;i++) {
				System.out.println(i+" ");
			}
		}
	
	
}
