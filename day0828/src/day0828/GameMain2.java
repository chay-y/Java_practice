package day0828;

import java.util.Scanner;

public class GameMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Character character=null;
		PlayGame pg = new PlayGame();
		
		System.out.println("원하는 캐릭터를 선택하세요");
		System.out.println("1.피카츄 2.이상해씨 3.꼬북이 >");
		int c=scan.nextInt();
		
		switch(c) {
		case 1:
			character = new Picachu();
			break;
		case 2:
			character = new Lee();
			break;
		case 3:
			character = new Gobook();
			break;
		}
		
		
		
		exit : while(true) {
			System.out.println("==========================================");
			System.out.println("1. 밥먹기 2. 잠자기 3. 놀기 4. 운동하기 5. 종료 >");
			int menu = scan.nextInt();
		
			
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
				break exit;		
			}
		}
	
		character.printInfo();
		
//		if(character.checkEngrgy()) {
//			System.out.println("게임을 종료합니다");
//			break;
//		}
//		
	}
}
