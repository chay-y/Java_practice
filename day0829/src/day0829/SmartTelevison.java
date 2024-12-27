package day0829;

public class SmartTelevison implements RemoteControl, Searchable{

	int volume;
	
	public void turnOn() {
		System.out.println("SmartTelevison를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("SmartTelevison를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		
		if(volume>MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if(volume<MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("볼륨을"+volume+"로 설정합니다.");
	}
}
