package day0903;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int amPm = now.get(Calendar.AM_PM);
		
		System.out.println(amPm);
		
		if (amPm == Calendar.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");
		
	}
	
}
