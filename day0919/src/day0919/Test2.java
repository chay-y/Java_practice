package day0919;

class Student{
	int age;
	int classNumber;

	
	Student (int age, int classNumber){
		this.age=age;
		this.classNumber=classNumber;
	}
	
	
	//compareable의 compareTo메서드는
	//자기 자신과 매개변수를 비교
	//->자기 자신을 기준으로 상대방과의 차이값을 비교하여 변환
//	@Override
	public int compareTo(Student o) {
		//자기 자신의 age가 o의 age보다 크면 양수
//		if(this.age > o.age) {
//			return 1;
//		}else if (this.age==o.age) {
//			return 0;
//		}else {
//			return -1;
//		}
//		//자기 자신의 age가 o의 age보다 크면 양수
		//같으면 0, 적으면 음수
		return this.classNumber - o.classNumber;
	}
	
	public int compare(Student o1, Student o2) {
		if(o1.classNumber > o2.classNumber) {
			return 1;
		} else if (o1.classNumber == o2.classNumber){
			return 0;
		} else {
			return -1;
		}
	}
}

public class Test2 {
	public static void main(String[] args) {
		Student a = new Student(14, 2);
		Student b = new Student(30, 1);
		Student c = new Student(11, 5);
		
		//compareble을 이용하여 객체 비교
		//int isBig = a.compareTo(b);
		
		//comparator을 이용하여 객체 비교
		int isBig = a.compare(b,c);
		
		if(isBig>0) {
				System.out.println("a객체가 b보다 큽니다.");
		}else if(isBig == 0) {
			System.out.println("a객체와 b객체가 같습니다.");
		}else {
			System.out.println("a객체가 b보다 작습니다.");
		}
	}
	
}
