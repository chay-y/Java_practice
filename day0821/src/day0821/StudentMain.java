package day0821;

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return Math.round((kor+eng+math)/3f*10)/10.0f;
	}
}

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student p1 = new Student("이이름",1,21,100,93,43);
		Student p2 = new Student("김이름",2,8,67,75,93);
		Student p3 = new Student("하이름",3,15,87,100,82);
		
		
		System.out.println("이름 :"+p1.name);
//		System.out.printf("\nint\tban\t%s반",p1.ban);
//		System.out.printf("\nint\tno\t%s번",p1.no);
//		System.out.printf("\nint\tkor\t%s점",p1.kor);
//		System.out.printf("\nint\teng\t%s점",p1.eng);
//		System.out.printf("\nint\tmath\t%s점",p1.math);
		System.out.println("총합 : "+p1.getTotal()+"점");
		System.out.println("평균 : "+p1.getAverage()+"점\n");
		
		System.out.println("이름 :"+p2.name);
//		System.out.printf("\nint\tban\t%s반",p2.ban);
//		System.out.printf("\nint\tno\t%s번",p2.no);
//		System.out.printf("\nint\tkor\t%s점",p2.kor);
//		System.out.printf("\nint\teng\t%s점",p2.eng);
//		System.out.printf("\nint\tmath\t%s점",p2.math);
		System.out.println("총합 : "+p2.getTotal()+"점");
		System.out.println("평균 : "+p2.getAverage()+"점\n");
		
		System.out.println("이름 :"+p3.name);
//		System.out.printf("\nint\tban\t%s반",p3.ban);
//		System.out.printf("\nint\tno\t%s번",p3.no);
//		System.out.printf("\nint\tkor\t%s점",p3.kor);
//		System.out.printf("\nint\teng\t%s점",p3.eng);
//		System.out.printf("\nint\tmath\t%s점",p3.math);
		System.out.println("총합 : "+p3.getTotal()+"점");
		System.out.println("평균 : "+p3.getAverage()+"점");
		
		
	}
}
//class Student{
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	
//	int total = 0;
//	double arr = 0;
//	
//	Student(String name, int ban, int no, int kor, int eng, int math){
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//	
//	int getTotal() {
//		return total = kor+eng+math;
//	}
//	
//	double getAverage() {
//		return arr = (double)total/3;
//	}
//}
//
//public class StudentMain {
//
//	public static void main(String[] args) {
//		System.out.printf("타입\t변수명\t설명");
//		
//		Student p1 = new Student("이이름",1,21,100,95,43);
//		Student p2 = new Student("김이름",2,8,67,75,93);
//		Student p3 = new Student("하이름",3,15,87,100,82);
//		
//		System.out.printf("\nString\tname\t%s",p1.name);
//		System.out.printf("\nint\tban\t%s반",p1.ban);
//		System.out.printf("\nint\tno\t%s번",p1.no);
//		System.out.printf("\nint\tkor\t%s점",p1.kor);
//		System.out.printf("\nint\teng\t%s점",p1.eng);
//		System.out.printf("\nint\tmath\t%s점",p1.math);
//		System.out.printf("\nint\tgetTotal\t%s점",p1.getTotal());
//		System.out.printf("\ndouble\tgetAverage\t%1.5s점",p1.getAverage());
//		
//		System.out.printf("\nString\tname\t%s",p2.name);
//		System.out.printf("\nint\tban\t%s반",p2.ban);
//		System.out.printf("\nint\tno\t%s번",p2.no);
//		System.out.printf("\nint\tkor\t%s점",p2.kor);
//		System.out.printf("\nint\teng\t%s점",p2.eng);
//		System.out.printf("\nint\tmath\t%s점",p2.math);
//		System.out.printf("\nint\tgetTotal\t%s점",p2.getTotal());
//		System.out.printf("\ndouble\tgetAverage\t%1.5s점",p2.getAverage());
//		
//		System.out.printf("\nString\tname\t%s",p3.name);
//		System.out.printf("\nint\tban\t%s반",p3.ban);
//		System.out.printf("\nint\tno\t%s번",p3.no);
//		System.out.printf("\nint\tkor\t%s점",p3.kor);
//		System.out.printf("\nint\teng\t%s점",p3.eng);
//		System.out.printf("\nint\tmath\t%s점",p3.math);
//		System.out.printf("\nint\tgetTotal\t%s점",p3.getTotal());
//		System.out.printf("\ndouble\tgetAverage\t%1.5s점",p3.getAverage());
//	
//		
//		
//	}
//}
