package day0820;

public class Tv {
	
	//필드, 멤버변수(tv의 속성)
	String color; 	//색상
	boolean power;	//전원
	int channel;	//채널
	int volume;		//볼륨
	
	//메서드 (tv의 기능)
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}
	
	void setChannel(int ch){
		channel = ch;
		
	}
}
