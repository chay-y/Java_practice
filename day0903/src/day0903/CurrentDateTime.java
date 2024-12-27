package day0903;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate w = LocalDate.of(2024, 9, 3);
		
		System.out.println(now);
		System.out.println(w);
		
		LocalDate seoulNow = LocalDate.now(ZoneId.of("Asia/Seoul"));
		LocalDate nyNow = LocalDate.now(ZoneId.of("America/New_York"));
		LocalDate londonNow = LocalDate.now(ZoneId.of("Europe/London"));
		
		System.out.println("서울 : "+seoulNow);
		System.out.println("뉴욕 : "+nyNow);
		System.out.println("런던 : "+londonNow);
		
		//달이나 일을 ++
		LocalDate plusMonths = now.plusMonths(1);
		LocalDate plusDays = now.plusDays(1);
		
		//달이나 일을 --
		LocalDate minusMonths = now.minusMonths(1);
		LocalDate minusDays = now.minusDays(1);
		
		
		System.out.println("plusMonths : "+plusMonths);
		System.out.println("plusDays : "+plusDays);
		System.out.println("minusMonths : "+minusMonths);
		System.out.println("minusDays : "+minusDays);
		
		System.out.println();
		
		//형식 정의
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		
		//형식 적용
		String formatedNow = now.format(formatter);
		
		//결과출력
		System.out.println(formatedNow);
		
		int year = now.getYear();
		int month = now.getMonthValue();
		String month2 = now.getMonth().toString();
		int day = now.getDayOfMonth();
		String week = now.getDayOfWeek().toString();
		int week2 = now.getDayOfWeek().getValue();
		
		System.out.println();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(month2);
		System.out.println(day);
		System.out.println(week);
		System.out.println(week2);
		
		
	}
}
