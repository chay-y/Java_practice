package day0814;

import java.util.Scanner;

public class IfExam1 {
	public static void main(String[] args) {
		//사용자에게서 두개의 숫자를 입력받아서
		//둘 중 더 큰 수를 출력
		int x, y, max;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 > ");
		x = scan.nextInt();
		
		System.out.println("두번째 정수 > ");
		y = scan.nextInt();
		
		if (x>y) {
			max = x;
		}else {
			max = y;
		}
		
		System.out.println("큰 수는"+max);
	}
}
