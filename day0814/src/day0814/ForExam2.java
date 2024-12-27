package day0814;

public class ForExam2 {

	public static void main(String[] args) {
		//1부터 20까지의 정수 중에서
		//2의 배수가 아니면서 3의 배수가 아닌 값들의
		//합계와 개수를 출력
		
		int num = 0;
		int numSum = 0;
		for (int i=1; i<=20; i++) {
			if (i%2==1 && i%3==1) {
				numSum += i;
				num++;
			} 
		}
		System.out.println("합계 : " + numSum);
		System.out.println("개수 : " + num);
	}
}
