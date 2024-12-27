package day0902;

import java.util.Scanner;

public class String_exam3 {
	
	public static void main(String[] args) {
		
		//시도횟수가 10번 이상이면 게임을 종료하고 정답을 알려줌
		
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		String[] words = {"java","student","spring","server","database"};
	
		int index = (int)(Math.random()*words.length);
		
		String question = words[index];
		
		StringBuffer answer = new StringBuffer(question.length());
		
		for(int i=0; i<question.length(); i++) {
			answer.append("_");
		}
		
		while(true) {
			System.out.println(answer);
			
			if(question.equals(answer.toString())) {
				 System.out.println("정답입니다..");
				 System.out.println(cnt+"번만에 맞췄습니다.");
				 break;
			 }else if(cnt>10){
				 System.out.println("정답은"+question+"입니다.");
				 break;
			 }
			
			System.out.print("글자를 추측하시오 >" );
			
			 char s = sc.next().charAt(0);
			 System.out.println(s);
			 
			 for(int i=0; i<question.length(); i++) {
				 if (s == question.charAt(i)) {
					 answer.setCharAt(i, s);
				 }
			 }
			 
			 cnt++;
			
		}
	
	}
}
