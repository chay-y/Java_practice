package Day0912;

public class Counter {

	int value = 0;
	
//	synchronized :동기화
//	동기화된 메서드는 동시에 호출되더라도 세부과정이
//	다른 스레드와 겹치지 않는다.
//	해당 스레드가 종료될 때까지 다른 모든 스레드 중지 > 스레드 간섭 문제 해결
	
//	동기화된 베서드가 종료되면 자동으로
//	이후에 동기화된 메서드를 호출하면 변경한 상태를 볼 수 있음 > 메모리 일관성 오류 해결
	
	public synchronized void increment() {
		value++;
	}
	
	public synchronized void decrement() {
		value--;
	}
	
	public synchronized  void printCoutner() {
		System.out.println(value);
	}
}
