package day0814;

import java.util.Scanner;

public class ASCIITest1 {
	public static void main(String[] args) {
		//사용자에게 입력
		Scanner scan = new Scanner(System.in);
		
		//영문자를 입력받아
		//입력된 문자가 대문자이면 소문자로 출력.
		//소문자이면 대문자로 출력
		//그 외의 문자면 오류 라고 출력
		System.out.println("영문자 입력 > ");
		
		String word = scan.nextLine(); //문자열
		char c = word.charAt(0);
		
		if(c>=65 && c<=90) {
			System.out.println(word.toLowerCase());
		}else if (c>=97 && c<=122) {
			System.out.println(word.toLowerCase());
		}else {
			System.out.println("오류");
		}
	}
}
