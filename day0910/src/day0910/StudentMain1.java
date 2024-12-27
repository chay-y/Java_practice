package day0910;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentMain1 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		//학번이 같으면 동일한 학생으로 가정하고 중복 저장이 되지 않도록 하고자함
		set.add(new Student(1,"김그린"));
		set.add(new Student(2,"정디비"));
		set.add(new Student(1,"이자바"));
		
		Iterator<Student> it = set.iterator();
		
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
		

				
	}
}
