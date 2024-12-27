package day0909;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("Car");
		set.add("ddd");
		set.add("bbb");
		set.add("aaa");
		set.add("Qqq");
		set.add("www");
		set.add("eee");
		set.add("rrr");
		set.add("ttt");
		set.add("yyy");
		set.add("ddd");
		set.add("Dddd");
		
		
		System.out.println(set);
		
		System.out.println(((TreeSet) set).subSet(from,to+"zzzz"));
		
	}
}
