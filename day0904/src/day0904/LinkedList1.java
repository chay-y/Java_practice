package day0904;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("ArrayList 소요시간 : "+(endTime-startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
//			list1.add(String.valueOf(i));//맨뒤에추가
			list1.add(0, String.valueOf(i));//맨앞에추가
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("ArrayList 소요시간 : "+(endTime-startTime)+"ms");
	}
}
