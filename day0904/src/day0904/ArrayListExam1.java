package day0904;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListExam1 {

	public static void main(String[] args) {
		LinkedList<String>list = new LinkedList<String>(3);
		
		list.add("aaa");
		list.add("ccc");
		list.add("fff");
		
		print(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 값을 입력 > ");
		String st = sc.nextLine();
		
		if(list.contains(st)) {
			int idx = list.indexOf(st);
			System.out.println(idx+"위치에서 "+list.get(idx)+" 검색");
		}else {
			System.out.println("찾는 값이 없음");
		}
		
		
		System.out.println();
		System.out.print("삭제할 값을 입력 > ");
		String del = sc.nextLine();
		
		if(list.contains(del)) {
			int idx = list.indexOf(del);
			list.remove(idx);
		}else {
			System.out.println("삭제할 값이 없음");
		}
		print(list);
		
		System.out.println("=================");
		System.out.println("전체 삭제");
	
//		for(int i=list.size()-1; i>=0; i--) {
//			list.remove(i);
//		}
		
		for(int i=list.size()-1; i>=0; i--) {
			if(list.contains(list.get(i))) {
				list.remove(i);
			}
		}
		
		if(list.isEmpty()) {
			System.out.println("리스트가 비었음");
		}else {
			System.out.println("전체 삭제 실패");
		}
		
		
		print(list);
		
		
	}
	static void print(ArrayList list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번째 요소 : "+list.get(i));
		}
	}
}
