package day0828;

public class Picachu extends Character {

	public Picachu() {
		hp=30;
		energy=50;
		System.out.println("피카츄가 생성되었습니다.");
		printInfo();
	}
	
	@Override
	public void eat() {
		System.out.println("밥을 먹어요");
		energy +=10;
	}
	@Override
	public void sleep() {
		System.out.println("잠을 자요");
		energy +=5;
	}
	@Override
	public boolean play() {
		System.out.println("놀아요");
		energy -=20;
		hp+=5;
		levelUp();
		checkEngrgy();
		return false;
	}
	@Override
	public boolean train() {
		System.out.println("운동을 해요");
		energy -=15;
		hp+=20;
		levelUp();
		return false;
	}
	@Override
	public void levelUp() {
		System.out.println("레벨업!");
		if(hp>=40) {
			level++;
			hp-=40;
		}
	}
	
}
