package day0902;

import java.util.Scanner;

public class String_exam2 {

	public static void main(String[] args) {
		//사용자에게서 한글자를 입력받아
		//입력한 문자가 영어인지 숫자인지 출력
		
		String al = "qwertyuiopasdfghjklzxcvbnm";
		String num = "1234567890";
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int alIdx = al.indexOf(str);
		int numIdx = num.indexOf(str);
		
		if(alIdx != -1) {
			System.out.println("입력하신 "+str+"은 문자입니다.");
		}else if(numIdx != -1) {
			System.out.println("입력하신 "+str+"은 숫자입니다.");
		}else {
			System.out.println("입력하신 값을 다시 확인하세요");
		}
		
		System.out.println("----------------");
		
		//아스키코드로 확인
		
		int asc = str.charAt(0);
		
		if((asc>=65 && asc<=90)||(asc>=97 && asc<=122)) {
			System.out.println("입력하신 "+str+"은 문자입니다.");
		}else if((asc>=48 && asc<=57)) {
			System.out.println("입력하신 "+str+"은 숫자입니다.");
		}else {
			System.out.println("입력하신 값을 다시 확인하세요");
		}
		
		
		
	}
}
