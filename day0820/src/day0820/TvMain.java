package day0820;

public class TvMain {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		
		t.channel = 7;
		t.volume = 9;
		System.out.println("Tv의 채널 :"+t.channel);
		System.out.println("Tv의 볼륨 :"+t.volume);
		
		t.channelDown();
		
		System.out.println("Tv의 채널 :"+t.channel);
		System.out.println("Tv의 볼륨 :"+t.volume);
		
		//2개의 인스턴스 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("Tv의 채널 :"+t1.channel);
		System.out.println("Tv의 볼륨 :"+t1.volume);
		System.out.println();
		System.out.println("Tv의 채널 :"+t2.channel);
		System.out.println("Tv의 볼륨 :"+t2.volume);
		
		t1.channel = 7;
		t2.channel = 23;
		System.out.println("t1과t2의 채널을 변경");
		
		System.out.println("Tv의 채널 :"+t1.channel);
		System.out.println("Tv의 볼륨 :"+t1.volume);
		System.out.println();
		System.out.println("Tv의 채널 :"+t2.channel);
		System.out.println("Tv의 볼륨 :"+t2.volume);
		
		System.out.println("-----------------------------------------");
		
		Tv t3 = new Tv();
		Tv t4 = new Tv();
		t4=t3;
		t3.channel = 3;
		
		System.out.println("Tv3의 채널 :"+t3.channel);
		System.out.println("Tv3의 볼륨 :"+t3.volume);
		System.out.println();
		System.out.println("Tv4의 채널 :"+t4.channel);
		System.out.println("Tv4의 볼륨 :"+t4.volume);
		
	}
}
