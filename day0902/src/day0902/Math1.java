package day0902;

public class Math1 {

	public static void main(String[] args) {
		int v1 = Math.min(4, 8);
		System.out.println("v1 : "+v1);
		
		long v2 = Math.round(5.3);
		System.out.println("v2 : "+v2);
		
		long v3 = Math.round(5.8);
		System.out.println("v3 : "+v3);
		
		
		//rint() : 가까운 정수의 실수값으로 리턴
		//소수점이 .5인 경우에
		//홀수는 올림, 짝수는 버림처리함
		//반올림은 5이상을 모두 올림처리하므로
		//값의 오차범위를 줄이기 위해 사용
		double v4 = Math.rint(8.5);
		double v5 = Math.rint(5.7);
		System.out.println("v4 : "+v4);
		System.out.println("v5 : "+v5);
		
		double sum = 0, sumRound = 0, sumRint = 0;
		
		for (double i=1.5; i<=10.5; i++) {
			sum += i;
			sumRound +=Math.round(i);
			sumRint += Math.rint(i);
		}
		
		System.out.println("sum : "+sum);
		System.out.println("sumRound : "+sumRound);
		System.out.println("sumRint : "+sumRint);
	}
}
