package day0909;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0; set.size()<10; i++) {
			int num=(int)(Math.random()*15+1);
			set.add(num);
		}
		
		System.out.println(set);
	}
}
