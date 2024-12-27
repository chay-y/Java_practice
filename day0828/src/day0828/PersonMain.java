package day0828;

import java.util.Scanner;

class Person{
	String name;
	int age;
	String adress;
	
	Person(String name,int age,String adress){
		this.name=name;
		this.age=age;
		this.adress=adress;
	}
	
	void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+adress);
	}
}

class Student extends Person{
	String school;
	String major;
	int classNum;
	double score[];
	
	Student(String name,int age,String adress,String school,String major,int classNum){
		super(name, age, adress);
		this.school=school;
		this.major=major;
		this.classNum=classNum;
		score=new double[8];
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("학교 : "+school);
		System.out.println("학과 : "+major);
		System.out.println("학번 : "+classNum);
	}
	
	
}

public class PersonMain {

	public static void main(String[] args) {
		Student stu = new Student("김그림", 20,"울산시 남구","울산대학교","컴퓨터공학과",202412345);
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("이름 : "+stu.name);
		System.out.println("나이 : "+stu.age);
		System.out.println("주소 : "+stu.adress);
		System.out.println("학교 : "+stu.school);
		System.out.println("학과 : "+stu.major);
		System.out.println("학번 : "+stu.classNum);
		System.out.println("==========================");
		System.out.println("8학기 학점을 순서대로 입력하세요");
		
		for(int i=0; i<stu.score.length; i++) {
			System.out.println((i+1)+"학기 학점 -> ");
			stu.score[i] = s.nextDouble();
		}
		
		System.out.println("==========================");
//		System.out.println("8학기 평균 학점 : "+stu.average());
		
	}
}
