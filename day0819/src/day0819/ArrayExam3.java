package day0819;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {
		
//	문자열.toCharArray() : 문자열을 한글자씩 쪼개서 char 타입의 배열에 저장함	
//		String str = "abcde";
//		char[] ch = str.toCharArray();
//		System.out.println(Arrays.toString(ch));
		
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"computer", "mouse", "java", "springboot", "database"};
		
		for (int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			for (int j=0; j<question.length; j++) {
				int r=(int)(Math.random()*question.length);
				char tmp = question[i];
				question[i] = question[r];
				question[r] = tmp;
			}
			System.out.printf("Q%d. %s의 정답은? > ",i+1, new String(question));
			String answer = scan.nextLine();
			
			if (answer.equals(words[i])) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("틀렸습니다..");
			}
		}
		
		
}
}
