package day0819;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam4 {

	public static void main(String[] args) {
		
//		극장 예약 시스템 만들기
//		좌석이 10개인 극장이 있다.
//		사용자가 예약하려고 하면 먼저 좌석 배치도를 보여주고
//		예약이 끝난 좌석은 1, 예약이 안된 좌석은 0으로 표시한다.
//		
//		조건1, 좌석이 예약되면 해당 좌석을 1로 변경함
//		조건2, 사용자가 이미 예약된 자리를 선택한다면
//				'이미 예약된 좌석입니다.' 출력
//		조건3, 음수를 입력하면 종료도되록 설정
		
//		Scanner scan = new Scanner(System.in);
//		boolean run = true;
//		int reSit = 0;
//		
//		while(run) {
//			System.out.println("---------------------------------------");
//			System.out.println("1   2   3   4   5   6   7   8   9   10");
//			System.out.println("---------------------------------------");
//			int[] sit = {0,0,0,0,0,0,0,0,0,0};
//			for(int i=0; i<sit.length; i++) {
//				System.out.print(sit[i]+"   ");
//			}
//			System.out.println("\n---------------------------------------");
//			System.out.println("원하는 좌석 번호를 입력하세요(종료 : -1)> ");
//			int reservation = scan.nextInt();
//			switch(reservation) {
//			case 1:
//				if(scan.nextInt()==1) {
//					sit[1] += 1;
//				}
//			}
		
		final int SIZE = 10;
		int[] seats = new int [SIZE];
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("=============================");
			for (int i=0; i<SIZE; i++) {
				System.out.print((i+1)+"  ");
			}
			System.out.println("\n=============================");
			
			for (int i=0; i<SIZE; i++) {
				System.out.print(seats[i]+"  ");
			}
			System.out.println("\n=============================");
			System.out.println("원하는 좌석번호를 입력하세요(종료는 -1) >");
			
			int num = scan.nextInt();
			
			if (num == -1) {
				System.out.println("종료합니다.");
				break;
			}
			
			if(seats[num-1]==0) {
				seats[num-1] = 1;
				System.out.println("예약되었습니다.");
				System.out.println();
			}else {
				System.out.println("이미 예약된 자리입니다. \n");
			}
		}
		
		
		
	}
}
