package day0902;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int yearDay = now.get(Calendar.DAY_OF_YEAR);
		
		System.out.println(yearDay);
		
		System.out.println("년 : "+year);
		System.out.println("월 : "+month);
		System.out.println("일 : "+day);
		System.out.println("요일 : "+week);
		
		switch(week) {
		case 1 :
			System.out.println("일요일");
			break;
		case 2 :
			System.out.println("월요일");
			break;
		case 3 :
			System.out.println("화요일");
			break;
		case 4 :
			System.out.println("수요일");
			break;
		case 5 :
			System.out.println("목요일");
			break;
		case 6 :
			System.out.println("금요일");
			break;
		case 7 :
			System.out.println("토요일");
			break;
			
		}
	}
}
