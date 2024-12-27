package day0909;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetExam2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num=(int)(Math.random()*45)+1;
			set.add(num);
		}
//		System.out.println("로또 번호는? >> "+set);
		
		List list = new LinkedList(set);
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
