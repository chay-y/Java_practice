package day0828;

public abstract class Character {

	protected int hp;
	protected int energy;
	protected int level = 1;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	
	public boolean checkEngrgy() {
		if (energy<=0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void printInfo() {
		System.out.println("==현재 캐릭터의 정보==");
		System.out.println("hp : "+hp);
		System.out.println("energy : "+energy);
		System.out.println("level : "+level);
		System.out.println("==================");
	}
}
