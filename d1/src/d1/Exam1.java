package d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList nums = new ArrayList(3);
		
		System.out.print("첫번재 정수를 입력하시오 > ");
		int n1 = sc.nextInt();
		System.out.print("두번재 정수를 입력하시오 > ");
		int n2 = sc.nextInt();
		System.out.print("세번재 정수를 입력하시오 > ");
		int n3 = sc.nextInt();
		
		nums.add(n1);
		nums.add(n2);
		nums.add(n3);
		
		if(n1 == n2 || n1 == n3 || n2 == n3) {
			System.out.println("----------------------------");
			System.out.println("중복값은 입력할 수 없습니다.");
		}else {
			Collections.sort(nums,Collections.reverseOrder());
			System.out.println("----------------------------");
			System.out.println("큰 정수부터 출력합니다 - "+nums);
		}
		
		
	}
	
	
}
