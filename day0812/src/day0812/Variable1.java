package day0812;

public class Variable1 {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
//		x와 y의 값을 맞바꿔서 출력하기
		int temp=0;
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
	}

}
