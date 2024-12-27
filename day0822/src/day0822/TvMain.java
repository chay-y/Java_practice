//package day0822;
//
//class SmartTv{
//	
//}
//
//class Tv {
//	
//	boolean power;
//	int channel;
//	
//	void power() {
//		power = !power;
//	}
//	
//	void channelUp() {
//		++channel;
//	}
//	
//	void channelDown() {
//		--channel;
//	}
//}
//
//class Netflex{
//	boolean power;
//	int counter=0;
//
//	void power() {
//		power = !power;
//	}
//	
//	void play() {
//		System.out.println("재생중입니다.");
//	}
//	
//	void stop() {
//		System.out.println("정지하였습니다.");
//	}
//	
//	void ff() {
//		System.out.println("빨리감기.");
//	}
//	
//	void rew() {
//		System.out.println("<<되감기");
//	}
//}
//
//class Smart extends Tv{
//	Netflex net =new Netflex();
//	
//	void play() {
//		net.play();
//	}
//	void stop() {
//		net.stop();
//	}
//	void ff() {
//		net.ff();
//	}
//	void rew() {
//		net.rew();
//	}
//}
//
//public class TvMain {
//	public static void main(String[] args) {
//		SmartTv sTv = new SmartTv();
//		
//		if(sTv.power != true) {
//			sTv.power();
//			System.out.println("TV전원을 켭니다.");
//		}
//		
//		sTv.channel = 10;
//		
//		sTv.channelUp;
//		sTv.channelUp;
//		
//		System.out.println("현재 채널 : "+sTv.channel);
//		
//		sTv.channelDonw();
//		System.out.println("현재 채널 : "+sTv.channel);
//		
//		if(sTv.net.power !=true) {
//			sTv.net.power();
//			System.out.println("넷플릭스를 켭니다.");
//		}
//		
//		sTv.play();
//		sTv.ff();
//		sTv.rew();
//		sTv.stop();
//		sTv.play();
//		
//		if(sTv.net.power=true) {
//			sTv.net.power();
//			System.out.println("넷플릭스를 끕니다.");
//		}
//	}
//	
//}
