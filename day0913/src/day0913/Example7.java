package day0913;

interface Func<T>{
	public double apply(T t);
}

class Student{
	String name;
	int engScore;
	int mathScore;
	
	Student(String name, int engScore, int mathScore){
		this.name=name;
		this.engScore=engScore;
		this.mathScore=mathScore;
	}
}

public class Example7 {
	
	private static Student[] students = {
			new Student("김그린", 50, 90),
			new Student("정디비", 30, 87)
	};
	
	//평균 계산
	public static double avg(Func<Student> func) {
		int sum = 0;
		for (Student stu : students) {
			sum += func.apply(stu);
		}
		
		double avg = (double) sum / students.length;
		return avg;
	}
	
	public static void main(String[] args) {
		double engAvg = avg(s -> s.getEngScore());
		System.out.println("영어점수 평균 : "+engAvg);
		
		Func<Student> mathScoreFunc = new Func<Student>() {
			public double apply(Student s) {
				return s.getMathScore();
			};
		};
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학점수 평균 : "+mathAvg);
	}
	
}
