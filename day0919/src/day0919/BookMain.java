package day0919;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookManager bm = new BookManager();
		
		while(true) {
			System.out.println("------------도서 관리 프로그램------------");
			System.out.println("1. 도서 추가  2. 도서 검색  3. 전체 도서 목록  4. 도서 가격 수정  5. 도서 삭제  6. 종료");
			System.out.println("-------------------------------------");
			
			System.out.println("메뉴 선택 > ");
			int choice = scan.nextInt();

				switch(choice){
				case 1 :
					bm.addBook();
					break;
				case 2 :
					bm.searchBook();
					break;
				case 3 :
					bm.displayAllBooks();
					break;
				case 4 :
					bm.updateBook();
					break;
				case 5 :
					bm.removeBook();
					break;
				case 6 :
					System.out.println("시스템을 종료합니다...");
					return;
				default :
					System.out.println("잘못된 입력입니다.");
					break;
				}
		}
	}
}
