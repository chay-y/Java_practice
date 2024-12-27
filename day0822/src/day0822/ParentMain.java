package day0822;

class Parent{
	String name;
	
	void printInfo() {
		System.out.println("name : "+name);
	}
}

class Child extends Parent{
	String hobby;
	void printInfo() {
		System.out.println("name : "+name+"\nhobby : "+hobby);
	}
	
}

public class ParentMain {
	
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		p1.name="parent";
		p1.printInfo();
		
		System.out.println("----------------");
		
		c1.name="child";
		c1.hobby="swimming";
		c1.printInfo();

		
	}

}
