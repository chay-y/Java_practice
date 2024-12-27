package day0830;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("주소 >");
		String addr = s.next();

		s.nextLine();
		
		System.out.println("이름 >");
		String name = s.nextLine();
	
		System.out.println(name+" 님은 "+addr+"에 삽니다.");
		
	}
}
