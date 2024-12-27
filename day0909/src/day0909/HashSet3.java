package day0909;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		Person p = new Person("green",22);
		
		int hash1 = p.hashCode();
		int hash2 = p.hashCode();
		
		System.out.println(hash1);
		System.out.println(hash2);
		
		p.age=10;
		
		int hash3 = p.hashCode();
		System.out.println(hash3);
		
		System.out.println(hash1 == hash2);
		
		Person p1 = new Person("blue",10);
		Person p2 = new Person("blue",10);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("red",20));
		set.add(new Person("red",20));
		
		System.out.println(set);
		
	}
}
