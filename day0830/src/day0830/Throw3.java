package day0830;

import java.util.Arrays;

import java.util.Scanner;
//1~100사이의 랜덤수를 하나 지정하고
//사용자가 해당 숫자가 무엇인지 맞추고
//몇번째만에 정답을 맞췄는지 나타내시오.
//
//0~100사이의 숫자를 입려하지 않은 경우에는
//예외가 발생하도록 처리할 것
//dowhile문 사용하여 구현

public class Throw3 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		int check = 0;
//		
//		int[] arr = {(int)(Math.random()*100)+1};
//		
//		
//		for (int i=0; i<arr.length; i++) {
//			int r = (int)(Math.random()*arr.length);
//			int temp = 0;
//			temp = arr[i];
//			arr[i] = arr[r];
//			arr[r] = temp;
//		
//		while(true){
//			System.out.println("1부터 100까지의 숫자중 하나를 고르세요 >");
//			int answer = scan.nextInt();
//			
//			if(answer == (arr[i])) {
//				System.out.println("======================");
//				System.out.println("정답입니다.");
//				System.out.println("컴퓨터의 숫자 : "+arr[i]);
//				System.out.println("시도 횟수 : "+check);
//				System.out.println("======================");
//				break;
//			}else if(answer>100 && answer<1){
//				System.out.println("======================");
//				System.out.println("1에서 100 사이의 숫자를 입력하세요");
//				System.out.println("======================");
//			}else if(answer>arr[i]){
//				check++;
//				System.out.println("======================");
//				System.out.println("더 작은 수를 입력하세요");
//				System.out.println("틀렸습니다.");
//				System.out.println("시도 횟수 : "+check);
//				System.out.println("======================");
//			}else if(answer<arr[i]){
//				check++;
//				System.out.println("======================");
//				System.out.println("더 큰 수를 입력하세요");
//				System.out.println("틀렸습니다.");
//				System.out.println("시도 횟수 : "+check);
//				System.out.println("======================");
//			}
//			
//			}
//		
//		}}}
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("1~100사이의 숫자를 입력하시오");
			Scanner s= new Scanner(System.in);
			try {
			input = s.nextInt();
			
			if (input < 0 || input > 100) {
				throw new Exception("예외발생");
				}
			}
			catch(Exception e) {
				System.out.println("값이 유효하지 않습니다.");
				continue;
				}
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("정답입니다.");
				System.out.println("도전횟수 :"+count);
				break;
			}
		}while(true);
	
		}
		
}

