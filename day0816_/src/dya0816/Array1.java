package dya0816;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		//배열 생성 방법1
		int[] score1 = new int[5];
		
		score1[0] = 100;
		score1[1] = 90;
		score1[2] = 80;
		score1[3] = 70;
		score1[4] = 60;
		
		//방법2
		//배열의 생성과 값의 저장을 동시에 작성해야 함.
		//int[] score3; //변수선언
		//socre3 = {10, 9, 8, 7, 6}; //값 저장 -> 오류
		
		int[] score2 = {10, 9, 8, 7, 6};
		
		for(int i=0; i<score2.length; i++) {
			System.out.println(score2[i]);
		}
		
		//방법3 for문 이용
		int[] score3 = new int[5];
		//배열에 값 저장
		for (int i=0; i<score3.length; i++) {
			score3[i] = i*10;
		}
		//배열 출력
		for(int i=0; i<score3.length; i++) {
			System.out.println(score3[i]);
		}
		//Arrays.tostring : 배열의 값을 출력
		System.out.println(Arrays.toString(score2));
		
		//배열 출력의 예외
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		//예외적으로 char배열을 출력하면 구분자 없이 입력된 내용이 출력됨
		System.out.println(chArr);
		System.out.println(Arrays.toString(chArr));
		
	
	}
	
}
