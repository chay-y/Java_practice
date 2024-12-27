package day0826;

class CarTire{
	Tire t;
	public void run(){
		t.roll();
	}
}


class Tire{
	public void roll() {
		System.out.println("회전합니다.");
	}
}

class HankookTire extends Tire{
	public void roll() {
		System.out.println("한국타이어가 회전합니다.");
	}
}

class KumhoTire extends Tire{
	public void roll() {
		System.out.println("금호타이어가 회전합니다.");
	}
}
public class CarTireExample {

	public static void main(String[] args) {
	
//		타이어
//		ㄴ한국타이어	(타이어의 한국타이어)
//		ㄴ금호타이어	(타이어의 금호타이어)
		Tire ht = new HankookTire();
		Tire kt = new KumhoTire();	
		
		ht.roll();
		kt.roll();
		
		System.out.println("============");
		
		CarTire ct = new CarTire();
		
		ct.t = new Tire();
		ct.run();
		
		ct.t = new HankookTire();
		ct.run();
		
		ct.t = new KumhoTire();
		ct.run();
	}
}
