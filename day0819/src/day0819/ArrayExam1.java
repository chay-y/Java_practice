package day0819;

import java.util.Arrays;

public class ArrayExam1 {

	public static void main(String[] args) {
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];

//		1. ballArr에서 랜덤으로 3개를 뽑음
//		2. ball3에 3개의 숫자를 집어넣음
//		3. ball3의 배열을 출력함
		
		for (int i=0; i<ballArr.length; i++) {
			int r = (int)(Math.random()*ballArr.length);
			int temp = 0;
			temp = ballArr[i];
			ballArr[i] = ballArr[r];
			ballArr[r] = temp;
		}
		System.out.println(Arrays.toString(ballArr));
		
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		System.out.println(Arrays.toString(ball3));
	}
}
