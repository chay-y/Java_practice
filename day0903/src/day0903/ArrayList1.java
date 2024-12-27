package day0903;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		
		System.out.println("배열의 길이>"+arr.length);
		
		ArrayList list = new ArrayList(100);
		System.out.println("ArrayList의 길이>"+list.size());
		
		list.add(10);
		System.out.println("ArrayList의 길이>"+list.size());
	}
}
