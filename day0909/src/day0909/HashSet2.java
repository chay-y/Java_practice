package day0909;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java");
		set.add("MyBatis");

		int size = set.size();
		
		System.out.println("총 객체수 : "+set.size());
		
		for(String element : set) {
			System.out.println();
		}
		
	}
}
