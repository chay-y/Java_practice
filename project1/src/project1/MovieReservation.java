package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieReservation {
	int ReservationNum;
	List<Integer> seatNums = new ArrayList<Integer>();
	
	public void MovieReservation() {
		Scanner scan = new Scanner(System.in);
		final int SIZE = 45;
		int[] seats = new int[SIZE];
		
		int personNum;
		int seatNum;
		
		System.out.println("예매하실 영화를 선택해주세요 > ");
		String choiceMovie = scan.nextLine();
		for (Movie title : choiceMovie) {
			
		}

		
		while(true) {
			System.out.println("좌석은 1번부터 45번까지 선택 가능합니다.");
			System.out.println("원하는 좌석번호를 입력하세요(취소는 -1) >");
			
			seatNum = scan.nextInt();
			
			if (seatNum == -1) {
				System.out.println("좌석입력을 취소합니다.");
				break;
			}
			
			if(seats[seatNum-1]==0) {
				seats[seatNum-1] = 1;
				System.out.println("예약되었습니다.");
				System.out.println();
				seatNums.add(seatNum);
				break;
			}else {
				System.out.println("이미 예약된 자리입니다. \n");
			}
		}
		
	}
	
}
