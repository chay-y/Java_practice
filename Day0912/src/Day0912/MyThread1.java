//package Day0912;
//
//public class MyThread1 {
//
//	Counter counter;
//	
//	public MyThread1 (Counter counter) {
//		this.counter=counter;
//	}
//	
//	public void run() {
//		int i=0;
//		while(i<2000) {
//			counter.increment();
//			counter.decrement();
//			
//			if(i%40==0) {
//				counter.printCoutner();
//			}
//			sleep((int)(Math.random()*2));
//		}
//	}
//	
//}
