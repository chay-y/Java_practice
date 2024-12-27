package day0829;

interface RemoteControl{
	
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
}


class Television implements RemoteControl{
	
	int volume;
}
	@Override
	public void turnOn() {
		System.out.println("Television를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Television를 끕니다.");
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

class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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

public class RemoteControlMain {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(23);
		rc.turnOff();
	}

}


