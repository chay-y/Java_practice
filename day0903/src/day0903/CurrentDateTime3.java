package day0903;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime3 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime dt = LocalDateTime.of(2001, 01, 20,11,22,33,123456789);
		
		System.out.println(now);
		
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초"));
		
		System.out.println(formatedNow);
	}
}
