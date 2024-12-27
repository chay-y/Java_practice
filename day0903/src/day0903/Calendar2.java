package day0903;

import java.util.Calendar;

public class Calendar2 {

	public static void main(String[] args) {
		final String[] WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
				
		System.out.println(date1);
		date1.clear();
		System.out.println(date1);
		date1.set(2015, 10, 15);
		
		System.out.println("date1은 "+toString(date1)
			+WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일입니다. ");
		System.out.println("오늘(date2)은 "+toString(date2)
		+WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");
		
		//두 날짜간의 차이를 계산할 떄에는 밀리초로 변환하여 계산해야함
		
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("date1부터 date2까지 "+diff+"초 지났습니다.");
		System.out.println("일로 계산하면 "+diff/(60*60*24)+"일 입니다.");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "
				+date.get((Calendar.MONTH)+1)+"월 "
				+date.get(Calendar.DATE)+"일 ";
	}
	
}
