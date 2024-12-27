package day0828;

import java.util.Scanner;

public class PlayGame {

	private Character character;
	private int menu;
	
	Scanner scan = new Scanner(System.in);
	
	public PlayGame(Character character) {
		this.character=character;
	}
	
	public void play() {
		System.out.println("-------------------------");
		System.out.println("1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.종료하기");
		menu = scan.nextInt();
	
	
	exit : while(true) {
		System.out.println("==========================================");
		System.out.println("1. 밥먹기 2. 잠자기 3. 놀기 4. 운동하기 5. 종료 >");
	
			switch(menu){
			case 1 :
				character.eat();
				break;
			case 2:
				character.sleep();
				break;
			case 3:
				character.play();
				break;
			case 4:
				character.train();
				break;
			case 5:
				System.out.println("종료되었습니다.");
				break;		
			}
			character.printInfo();
		}
	}
	public void isExit() {
		if(character.checkEngrgy()) {
			System.out.println("게임을 종료합니다");
			}
	}
}
