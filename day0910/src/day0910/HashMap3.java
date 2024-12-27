package day0910;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {

	public static void main(String[] args) {
		Map<Person, Integer>map=new HashMap<Person, Integer>();
		
		Person p1 = new Person(1,"김그린");
		Person p2 = new Person(1,"김그린");
		
		map.put(p1, 100);
		map.put(p2, 100);
		
		System.out.println("객체의 수 : "+map.size());
		
	}
}
