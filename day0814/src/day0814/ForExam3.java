package day0814;

public class ForExam3 {
	public static void main(String[] args) {
		
		int num = 0;
		for(int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
				num += j;
			}
		}
		System.out.println(num);
		
		
		System.out.println("-------------");
		
		int total2=0;
		int sum2=0;
		
		for(int i=1; i<=10; i++) {
			sum2 += i;
			total2 += sum2;
		}
		System.out.println(total2);
	}
}
