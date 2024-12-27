package day0904;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("JAVA");
		list.add("JSP");
		list.add("JDBC");
		list.add(2, "Database");
		list.add("myBatis");

//		객체의 크기
//		배열 : array.lenght; 속성
//		문자열 : string.lenght; 메서드
//		ArrayList : arrayList.size(); 메서드
		
		int size = list.size();
		System.out.println("총 객체의 수 : "+size);
		System.out.println();

		System.out.println(list.get(2));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+" : "+list.get(i));
		}
		
		System.out.println();
		
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+" : "+list.get(i));
		}
		
		System.out.println();
		
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+" : "+list.get(i));
		}
	}
	
}
