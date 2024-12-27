package day0828;

public class Character1 {
	int exp;
	int level=1;
	int energe;
	String act;
	
	Character1(int exp, int level, int energe){
		this.exp=exp;
		this.level=level;
		this.energe=energe;
		if (energe == 0) {
			System.out.println("캐릭터가 사망하였습니다.");
		}
	}
	
}

class Pika extends Character1{
	
	Pika(int exp, int level, int energe){
		super(exp, level, energe);
	}
	
	void eat() {
		this.energe +=10;
	}
	void sleep() {
		this.energe +=5;
	}
	
	void play() {
		this.energe -=10;
		this.exp +=5;
	}
	
	void practice() {
		this.energe -=10;
		this.exp +=5;
	}
	
	void levelUp() {
		if(exp == 40) {
			this.level++;
			System.out.println("레벨이 상승하였습니다");
			this.exp = 0;
		}
	}	
	void Info() {
		System.out.println("==피카츄==");
		System.out.println("기본 : 경험치 30 에너지 50");
		System.out.println("밥먹기 : 에너지 +10");
		System.out.println("잠자기 : 에너지 +5");
		System.out.println("놀기 : 에너지 -20, 경험치 +20");
		System.out.println("연습하기 : 에너지 -15, 경험치 +20");
		System.out.println("경험치가 40이 되면 레벨업");
		System.out.println("=========");
	}
	
	void nowInfo(String act) {
		if(act=="밥먹기") {
			eat();
		}else if(act=="잠자기"){
			sleep();
		}else if(act=="놀기") {
			play();
		}else if(act=="연습하기") {
			practice();
		}
		System.out.println("현재 경험치 :"+exp);
		System.out.println("현재 에너지 :"+energe);
		System.out.println("레벨 :"+level);
		
	}
	
	
	
}
