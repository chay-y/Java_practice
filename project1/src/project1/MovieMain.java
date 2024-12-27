package project1;

import java.util.Scanner;

public class MovieMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String passWord = "abc";
		while(true) {
			System.out.println("영화 예매 관리 프로그램");
			System.out.println("실행하기 : 1");
			System.out.println("종료하기 : 2");
			System.out.println(" >> ");
			int start = scan.nextInt();
			
			if(start == 1) {
				System.out.println("==========================");
				System.out.println("1 : 영화 예매");
				System.out.println("2 : 예매 조회");
				System.out.println("3 : 예매 취소");
				System.out.println("4 : 관리자 로그인");
				System.out.println("5 : 시스템 종료");
				System.out.println("==========================");
				
				int menu = scan.nextInt();
				
				switch(menu) {
				case 1 :
					break;
				case 2 :
					break;
				case 3 :
					break;
				case 4 :
					scan.nextLine();
					System.out.println("관리자 비밀번호 입력 > ");
					String password = scan.nextLine();
					if(passWord.equals(password)) {
						System.out.println("=========관리자 메뉴=========");
						System.out.println("1 : 영화 등록");
						System.out.println("2 : 예매 조회");
						System.out.println("3 : 예매 취소");
						System.out.println("4 : 관리자 로그인");
						System.out.println("5 : 메인메뉴로 돌아가기");
						System.out.println("==========================");
						int manager = scan.nextInt();
						
						switch(manager) {
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						}
					}else {
						System.out.println("관리자 로그인에 실패하셨습니다.");
						break;
					}
					break;
				case 5 :
					System.out.println("종료합니다..");
					System.exit(0);
				}
				
				
			}else if(start == 2) {
				System.out.println("종료합니다..");
				System.exit(0);
			}else {
				System.out.println("올바른 입력이 아닙니다.");
				break;
			}
			
			
		}
	}
}
