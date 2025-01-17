package day0909;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue1 {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("stack에서 0의 위치 : "+st.search("0"));
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		System.out.println("queue");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
