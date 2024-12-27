package day0828;

public class Lee extends Character{
	public Lee() {
		hp=20;
		energy=50;
		System.out.println("꼬북이가 생성되었습니다.");
		printInfo();
	}
	
	@Override
	public void eat() {
		System.out.println("밥을 먹어요");
		energy +=5;
	}
	@Override
	public void sleep() {
		System.out.println("잠을 자요");
		energy +=20;
	}
	@Override
	public boolean play() {
		System.out.println("놀아요");
		energy -=10;
		hp+=15;
		levelUp();
		checkEngrgy();
		return false;
	}
	@Override
	public boolean train() {
		System.out.println("운동을 해요");
		energy -=10;
		hp+=15;
		levelUp();
		return false;
	}
	@Override
	public void levelUp() {
		System.out.println("레벨업!");
		if(hp>=35) {
			level++;
			hp-=35;
		}
	}
	
}
