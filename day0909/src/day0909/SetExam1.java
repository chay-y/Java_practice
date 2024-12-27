package day0909;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class SetExam1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		//3,6,2,2,2,7
		System.out.println(list);

		HashSet set = new HashSet(list);
		//2,3,6,7
		System.out.println(set);
		
		TreeSet tset = new TreeSet(set);
		//2,3,6,7
		System.out.println(tset);
		
		//2,3,6,7
		Stack stack = new Stack();
		stack.addAll(tset);
		
		while(!stack.empty()) {
			System.out.print(stack.pop()+", ");
		}
	}
}
