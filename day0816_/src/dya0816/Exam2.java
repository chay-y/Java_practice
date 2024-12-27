package dya0816;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//1.선택창을 띄움
		//2.선택에 번호를 입력하면 해당하는 기능을 보여줌
		//3.종료가 아니라면 다시 선택창을 띄워줌
		//4.4를 입력하면 프로그램을 종료함
		
//		int saving = 10000;
//		int withDrow = 2000;
//		
//		for(int i=0; i<=4; i++) {
//			
//			System.out.println("-------------------------------------\n1.예금  |  2.출금  |  3.잔고  |  4.종료\n-------------------------------------\n선택>");
//			Scanner scan = new Scanner(System.in);
//			i = scan.nextInt();
//			
//			if(i==1) {
//				System.out.println("예금액 : "+saving);
//				continue;
//			}else if(i==2) {
//				System.out.println("출금액 : "+withDrow);
//				continue;
//			}else if(i==3) {
//				System.out.println("잔고 : "+(saving-withDrow));
//				continue;
//			}else {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			
//		}
		
		Scanner scan = new Scanner(System.in);
		
		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------\n1.예금  |  2.출금  |  3.잔고  |  4.종료\n-------------------------------------\n선택>");
			
			int menuNum = scan.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println("예금액 > ");
				balance += scan.nextInt();
				break;
			case 2:
				System.out.println("출금액 > ");
				balance -= scan.nextInt();
				break;
			case 3:
				System.out.println("예금액 > " + balance);
				break;
			case 4:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("다시 선택하세요.");
				continue;
			}
		}
	}
		
}
