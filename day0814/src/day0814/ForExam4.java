package day0814;

public class ForExam4 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i=1;
		for (i=1;true; i++) {
			if(i%2==1) {
				sum += i;
			}else{
				sum -= i;
			}
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("숫자 : "+i);
		System.out.println("합계 : "+sum);
		
		System.out.println("----------------------------------------");
		
		int sum2 = 0;   //합계 계산할 변
		int s=1;		//부호를 만들기 위한 변수
		int num = 0;		//부호가 적용된 숫자를 만들기위한 변수
		for (int j=0; true; j++) {
			num = s*i;
			sum2 += num;
			s*=-1;
			
			//for의 종료시점
			if (sum2>=100) {
				break;
			}
		}
		System.out.println("숫자 : "+num);
		System.out.println("합계 : "+sum2);
		
		System.out.println("----------------------------------------");
		
		int sum3=0;
		int num3=0;
		int s3=1;
		for (int j=1; sum3<100; j++, s3=-s3) {
			num3 = s3*j;
			sum3 += num3;
		}
		System.out.println("숫자 : "+num3);
		System.out.println("합계 : "+sum3);
	}
}
