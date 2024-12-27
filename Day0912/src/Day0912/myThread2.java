package Day0912;

class WorkObject {
	public void method1() {
		System.out.println("ThreadA의 method1() 실행");
		notify(); //일시 정지 상태에 있는 스레드를 실행 대기상태로 만듬.
		
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void method2() {
		System.out.println("ThreadB의 method1() 실행");
		notify();
		
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class ThreadA extends Thread{
	private WorkObject workObject;
	
	ThreadA(WorkObject workObject){
		this.workObject=workObject;
	}
		@Override
		public void run() {
			for(int i=0; i<10; i++) {
				workObject.method1();
			}
		}
	}

class ThreadB extends Thread{
	private WorkObject workObject;
	
	ThreadB(WorkObject workObject){
		this.workObject=workObject;
	}
		@Override
		public void run() {
			for(int i=0; i<10; i++) {
				workObject.method1();
			}
		}
}



public class myThread2 {

	public static void main(String[] args) {
	
	 
	}
}
