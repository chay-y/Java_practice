package dya0816;

import java.util.Arrays;

public class ArrayExam3 {

	public static void main(String[] args) {
		
		//배열 값들의 순서를 섞어서 출력
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		
		int randomArr = numArr[0];
		//n번째 값과 맞바꾸기
		for (int i=0; i<numArr.length; i++) {
			int j = (int)(Math.random()*10);
			randomArr = numArr[i];
			numArr[i] = numArr[j];
			numArr[j] = randomArr;
		}	
			System.out.println(Arrays.toString(numArr));
			
		
		
	}
}
