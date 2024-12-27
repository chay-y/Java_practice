package day0904;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(1);
		list1.add(0);
		list1.add(3);
		
		//subList() : ArrayList에서 일부를 뽑아 새로운 배열 생성
		//1부터 4미만까지
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		
		print(list1,list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1,list2);
		
		//원래있던 순서를 뒤집음
		Collections.reverse(list1);
		Collections.reverse(list2);
		
		print(list1,list2);
		
		//containsAll : list2의 모든 내용이 list1에 전부 포함되어 있는지 확인
		System.out.println("containsAll : "+list1.containsAll(list2));
		
		System.out.println();
		
		list2.add("B");
		list2.add("C");
		
		list2.add(3, "A");
		
		print(list1,list2);
		
		list2.set(3, "AA");
		
		print(list1,list2);
		
		list1.add(0,"1");
		
		print(list1,list2);
		
		//indexOf() : 지정된 객체의 위치(인덱스)를 알려줌..
		System.out.println("index : "+list1.indexOf("1")); 	//0
		System.out.println("index : "+list1.indexOf(1));  	//5
		
		//remove() : 지정된 위치의 값을 지움
		list1.remove(1);
		
		print(list1,list2);

		//list1.remove(new Integer(1));
		list1.remove(Integer.valueOf(1));
		
		print(list1,list2);
		
		//retainAll : list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("retainAll : "+list1.retainAll(list2));
		
		print(list1,list2);
		
//		삭제하기 - 뒤에서부터 지워야 전부 사라짐
		for(int i=list2.size()-1; i>=0; i--) {
			list2.remove(i);
		}
		
		print(list1,list2);
		
//		for(int i=list2.size(); i>=0; i--) {
//			if(list1.contains(list2.get(i))) {
//				list2.remove(i);
//			}
//		}
//		
//		print(list1,list2);
	}
	
	static void print(ArrayList list1,ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
}
