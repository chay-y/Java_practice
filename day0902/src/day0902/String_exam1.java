package day0902;

import java.util.Scanner;

public class String_exam1 {

	public static void main(String[] args) {
		//사용자에게 공백을 포함한 문자열을 입력받아
		//몇개의 단어가 있는지 출력

		
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 >");
		
		String str1 = s.nextLine();
		String[] arr = str1.split(" "); 
	
		for(String str2 : arr) {
			System.out.print(str2);
		}
		System.out.println("모두"+arr.length+"개의 단어가 있습니다.");
		
//		for(int i=0; i<=arr.length; i++) {
//			System.out.println(arr[i].trim()+",");
//			System.out.println("모두 "+(i+1)+"개의 단어가 있습니다.");
//		}
	
		
	}
}
