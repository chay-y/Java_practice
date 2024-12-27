package day0823;

class Tv{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	int preChannel = 0;
	
	//이전채널로 이동하는 기능의 메서드 만들기
	//메서드명 : gotoPrevChannel
	//기능 : 현재 채널을 이전 채널로 변경한다.
	
	//Tv클래스의 멤버변수에 적절한 접근제어자를 설정하고
	//getter, setter을 설정하시오.
	//max와 min 사이의 값만 설정가능해야 함
	
	//============파워=============
	
	public boolean getIsPowerOn(){
		return isPowerOn;
	}
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn=isPowerOn;
	}
	
	//============채널=============
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL || channel<MIN_CHANNEL) {
			return;
		}else {
			this.channel=channel;
			preChannel += channel;
		}	
	}
	
	//============볼륨=============
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume<MIN_VOLUME) {
			return;
		}else {
			this.volume=volume;
		}
	}
	
//	public void gotoPrevChannel() {
//		setChannel = channel;
//	}
	
	
}

public class TvMain {
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		tv.setChannel(10);
		System.out.println("ch : "+tv.getChannel());
		
		tv.setVolume(30);
		System.out.println("vo : "+tv.getVolume());
		
		
	}

}
