package day0903;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarExam2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("년도 입력 > ");
		int year = s.nextInt();
		
		System.out.println("년도 입력 > ");
		int month = s.nextInt();
		
		//시작일과 마지막날짜
		LocalDate sDay = LocalDate.of(year, month, 1);
		LocalDate eDay = sDay.plusMonths(1).minusDays(1);
		
		DayOfWeek firstDay = sDay.getDayOfWeek();
		
		//요일을 숫자로 변경
		int startWeek = firstDay.getValue()+1;
		
		int endDay=eDay.getDayOfMonth();
		
		System.out.println("     "+year+"년"+month+"월");
		System.out.println(" SU NO TU WE TH FR SA ");
		
		for(int i=1; i<startWeek;i++) {
			if(startWeek == 8) 
			break;
			System.out.print("   ");
		}
		
		for(int i=1, n=startWeek; i<=endDay; i++, n++) {
			System.out.print((i<10) ? "  " +i :" "+i);
			if(n%7 == 0) {
				System.out.println();
			}
			
		}
	}
}
