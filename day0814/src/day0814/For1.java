package day0814;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
	
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력>");
		int num = scan.nextInt();
		
		long eSum = 0, oSum = 0, tSum = 0;
		
		for (int i=1; i<=num; i++) {
			if(i%2==0) {
				eSum += i;
			}else {
				oSum += i;
			}
			tSum += i;
		}
		
		System.out.printf("짝수 합계 : %,d \n" + eSum);
		System.out.printf("홀수 합계 : %,d \n" + oSum);
		System.out.printf("총 합계 : %,d \n" + tSum);
		
		
		
		
	}
}
