package day0830;

class Point{
	int x;
	int y;
}

public class Clone1 {
	public static void main(String[] args) {
		
		//얕은복사 : 
		// 값이 아닌 '주소'값을 복사
		// 복사한 후에 원본의 값이 변경되면 복사한 값도 같이 변경됨.
		
		Point p1 = new Point();
		Point p2=p1; //얕은복사
		
		p1.x=10;
		p1.y=20;
		
		p2.x = 30;
		p2.y = 40;
		
		System.out.println("p1.x : "+p1.x);
		System.out.println("p1.y : "+p1.y);

		System.out.println("p2.x : "+p2.x);
		System.out.println("p2.y : "+p2.y);
	}
}
