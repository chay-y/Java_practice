package day0903;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime2 {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		LocalTime t = LocalTime.of(10, 33, 22, 123456789);
		
		System.out.println(t);
		
		
		// HH : 24시간 // hh : 12시간 //
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String formattedNow = t.format(formatter);
		
		System.out.println(formattedNow);
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
	}
}
