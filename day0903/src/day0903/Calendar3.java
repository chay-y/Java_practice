package day0903;

import java.util.Calendar;

public class Calendar3 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(2024, 2, 31);
		
		System.out.println("======1일후======");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("======6개월 전======");
		date.add(Calendar.DATE, -6);
		System.out.println(toString(date));
		
		System.out.println("======31일 후(add)======");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		//roll : 날짜를 더하거나 뺄 떄
		//다른 필드에 영향을 주지 않음.
				
		System.out.println("======31일 후(roll)======");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR)+"년 "
				+date.get((Calendar.MONTH)+1)+"월 "
				+date.get(Calendar.DATE)+"일 ";
	}
}
