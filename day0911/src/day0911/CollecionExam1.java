package day0911;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public double getAverage() {
		return (double)getTotal()/3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}

class StudentManager{
	
	Scanner scan = new Scanner(System.in);
	private ArrayList<Student> students;
	
	public StudentManager() {
		students = new ArrayList<>();
	}
	
	public void addStudent() {
		System.out.println("이름 > ");
		String name = scan.nextLine();
		System.out.println("국어 > ");
		int kor = scan.nextInt();
		System.out.println("영어 > ");
		int eng = scan.nextInt();
		System.out.println("수학 > ");
		int math = scan.nextInt();
		
		Student s = new Student(name, kor, eng, math);
		
		students.add(s);
		System.out.println("학생 정보가 추가되었습니다.");
	}
	
	public void searchStudent() {
		scan.nextLine();
		System.out.println("검색할 학생 이름 : ");
		String name = scan.nextLine();
		
		for(Student stu : students) {
			if(stu.getName().equals(name)) {
				System.out.println("이름 : "+stu.getName());
				System.out.println("국어 : "+stu.getKor());
				System.out.println("영어 : "+stu.getEng());
				System.out.println("수학 : "+stu.getMath());
				System.out.println("합계 : "+stu.getTotal());
				System.out.println("평균 : "+stu.getAverage());
				
				return;
			}else {
				System.out.println("일치하는 학생이 없습니다.");
			}
		}
	}
	
	public void allStudent() {
		
		System.out.println("전체 학생을 출력합니다.");
		
		for(Student stu : students) {
			System.out.println("이름 : "+stu.getName());
			System.out.println("국어 : "+stu.getKor());
			System.out.println("영어 : "+stu.getEng());
			System.out.println("수학 : "+stu.getMath());
			System.out.println("합계 : "+stu.getTotal());
			System.out.println("평균 : "+stu.getAverage());
		}
	}
}

public class CollecionExam1 {

	public static void main(String[] args) {
//		학생관리프로그램
//		1.학생 추가
//		-이름, 국어, 영어, 수학 점수 입력
//		2.학생 검색
//		-이름을 입력받아 해당하는 학생의 이름,국어,영어,수학,합계,평균 출력
//		3.모든 학생 보기
//		-모든 학생의 이름,국어,영어,수학,합계,평균 출력
//		4.종료
		
		int sum = 0;
		int avr = 0;
		
		Scanner scan = new Scanner(System.in);
		
		StudentManager sm = new StudentManager();
		
		while(true) {
			System.out.println("학생 관리 프로그램");
			System.out.println("1. 학생추가   2. 학생 검색   3. 모든 학생 보기   4. 종료");
			
			int choice = scan.nextInt();
			
				switch(choice){
				case 1 :
					sm.addStudent();
					break;
				case 2 :
					sm.searchStudent();
					break;
				case 3 :
					sm.allStudent();
					break;
				case 4 :
					System.out.println("시스템을 종료합니다...");
					break;
				}
		}
			
	}
}
