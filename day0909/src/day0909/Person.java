package day0909;

import java.util.Objects;

public class Person {

		String name;
		int age;
		
		Person(String name, int age){
			this.name=name;
			this.age=age;
		}
		
		@Override
		public String toString() {
			return name+" : "+age;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Person)) 
				return false;
			
			Person p =(Person) obj;
			return this.name.equals(p.name) && this.age==p.age;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(name,age);
		}
}

