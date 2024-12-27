package day0910;

import java.util.Iterator;

public class Student {

	int studentNum;
	String name;

	public Student(int studentNum,String name) {
		this.studentNum=studentNum;
		this.name=name;
	}

	@Override
	public boolean equals(Object obj) {
//		if (obj instanceof Student) {
//			Student s = (Student)obj;
//			if(s.studentNum == studentNum) {
//				return true;
//			}else {
//				return false;
//			}
//		}else {
//			return false;
//		}
		if(!(obj instanceof Student)) return false;
		Student s = (Student) obj;
		if(s.studentNum != studentNum) return false;
		return true;
	}
	@Override
	public int hashCode() {
		return studentNum;
	}
}
