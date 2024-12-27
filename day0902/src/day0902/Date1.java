package day0902;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		Date now = new Date();
		
		String StrNow1 = now.toString();
		
		System.out.println(StrNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
