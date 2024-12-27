package dya0816;

import java.util.Scanner;

public class Exam1 {
	
	public static void main(String[] args) {
		//키보드로 정수를 입력받아
		//그 수가 소수인지 아닌지 판단하여 출력하시오
		//소수 : 1과 자기 자신을 제외한
		//나머지로 나누었을때 떨어지지 않는 수
		
		System.out.println("숫자입력>");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int i=2; i<=num; i++) {
			if(num == i) {
				System.out.println(num+"은 소수입니다..");
			}else if(num%i==0) {
				System.out.println(num+"은 소수가 아닙니다..");
				break;
			}
		}
	}
}
