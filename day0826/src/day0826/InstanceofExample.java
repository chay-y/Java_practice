package day0826;

class Person{
	public String name;
	
	public Person(String name) {
		this.name=name;
	}
	
	public void walk() {
		System.out.println("걸어요");
	}
}

class Student extends Person{
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	public void study() {
		System.out.println("공부를 합니다.");
	}
}

public class InstanceofExample {
	public static void personInfo(Person person) {
		
		System.out.println("name : "+person.name);
		person.walk();
		
		//부모타입의 참조변수로 자식 객체를 다룰때는
		//자동형변환으로 처리가 됨.
		
		//자식타입의 참조변수로 부모 객체를 다뤄야할때는
		//원래 상태로 되돌려주기 위해서 사용
		if(person instanceof Student stu) {
//			Student stu = (Student)person;
			System.out.println(stu.studentNo);
			stu.study();
		}
		
	}
	public static void main(String[] args) {
		Person s1 = new Person("김그린");
		personInfo(s1);
		
		Student s2 = new Student("김그린", 0);
		personInfo(s2);
	}
}
