package day0828;

public class Gobook extends Character{
	public Gobook() {
		hp=40;
		energy=50;
		System.out.println("꼬북이가 생성되었습니다.");
		printInfo();
	}
	
	@Override
	public void eat() {
		System.out.println("밥을 먹어요");
		energy +=15;
	}
	@Override
	public void sleep() {
		System.out.println("잠을 자요");
		energy +=10;
	}
	@Override
	public boolean play() {
		System.out.println("놀아요");
		energy -=30;
		hp+=15;
		levelUp();
		checkEngrgy();
		return false;
	}
	@Override
	public boolean train() {
		System.out.println("운동을 해요");
		energy -=20;
		hp+=30;
		levelUp();
		return false;
	}
	@Override
	public void levelUp() {
		System.out.println("레벨업!");
		if(hp>=50) {
			level++;
			hp-=50;
		}
	}
	
}
