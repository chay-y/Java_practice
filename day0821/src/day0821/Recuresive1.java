package day0821;

public class Recuresive1 {

	public static void main(String[] args) {
		//팩토리얼
		//5! = 1*2*3*4*5
		
		int number = 5;
		int sum = 1;
		
		for(int i=1; i<=number; i++){
			sum *= i;
		}
		
		System.out.println(sum);
		
		//while문
		
		int num = 5;
		int total = 1;
		
		while(num !=0) {
			total *= num;
			num--;
		}
		
		System.out.println(total);
		
	}
}
