package day0827;

abstract class player{
	//추상메서드 : 선언부만 있고 구현부가 없음.
	abstract void play();
}

class Mp3player{
	void play() {
		System.out.println("mp3를 플레이합니다.");
	}
}

public class PlayerMain {

	public static void main(String[] args) {
		
	}
}
