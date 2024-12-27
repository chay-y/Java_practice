package day0814;

import java.util.Scanner;

public class WhileExam1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력 > ");
		int num = scan.nextInt();
		int sum = 0;
		
		while(num!=0) {
			sum += num % 10;
			num /= 10;
			System.out.println("sum : "+sum+" num : "+num);
		}
		
			
		}
	}

