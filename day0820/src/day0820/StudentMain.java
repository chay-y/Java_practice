package day0820;

public class StudentMain {
	public static void main(String[] args) {
		Student s;
		s = new Student();
				
		s.name="김그린";
		s.age=22;
		s.addr="울산시 중구 삼산동";
				
		s.studentInfo();
		
		Student s2;
		s2 = new Student();
		
		s2.name="이자바";
		s2.age=33;
		s2.addr="울산시 중구 성남동";
				
		s2.studentInfo();
	}
	
}
