package day0919;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
	
	List<Book> books = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	//도서 추가
	public void addBook() {
		System.out.println("책 제목 > ");
		String title = scan.nextLine();
		System.out.println("저자 > ");
		String author = scan.nextLine();
		System.out.println("가격 > ");
		int price = scan.nextInt();
		
		Book book = new Book(title,author,price);
		books.add(book);
		System.out.println("책이 추가되었습니다.");
	}
	//도서 검색
	public void searchBook() {
		System.out.println("책 제목 > ");
		String title = scan.nextLine();
		
		for (Book book : books) {
			if(book.getTitle().equals(title)) {
				System.out.println(book);
				break;
			}
		}
	}
	
	//전체 도서 출력
	public void displayAllBooks() {
		if (books.size() == 0) {
			System.out.println("등록된 책이 없습니다");
			return;
		}
		
		for (Book book : books) {
			System.out.println(book);
		}
	}
	//도서 가격 변경
	public void updateBook() {
		System.out.println("변경할 책 제목 > ");
		String title = scan.nextLine();
		for(Book book : books) {
			if(book.getTitle().equals(title)) {
				System.out.println("변경할 가격 > ");
				int price = Integer.parseInt(scan.nextLine());
				book.setPrice(price);
				System.out.println("가격이 변경되었습니다.");
			}else {
				System.out.println("해당 책을 찾을 수 없습니다.");
			}
		}
		
	}
	
	//도서 삭제
	public void removeBook() {
		System.out.println("삭제할 책 제목 > ");
		String title = scan.nextLine();
		
		for(Book book : books) {
			if(book.getTitle().equals(title)) {
				books.remove(book);
				System.out.println("책 정보가 삭제되었습니다.");
				break;
			}else {
				System.out.println("해당 책을 찾을 수 없습니다.");
			}
		}
	}
}
