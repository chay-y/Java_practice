package day0819;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
//		배열복사
//		1. for문 이용
		int[] number = {1, 2, 3, 4, 5};
		int[] newNumber = new int[10];
		
		for (int i=0; i<number.length; i++) {
			newNumber[i] = number[i];
		}
		
		for (int i=0; i<newNumber.length; i++) {
			System.out.print(newNumber[i]+", ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		
//		2. System.arraycopy() 이용
		
		String[] oldStrArr = {"java", "array", "copy"};
		String[] newStrArr = new String[5];
		
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for (int i=0; i<newStrArr.length; i++){
			System.out.print(newStrArr[i]+",");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		//배열을 복사할 때는 값의 타입이 맞아야 한다
		char[] arr1 = {'0','1','2','3','4'};
		char[] arr2 = new char[5];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for (int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+",");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
//		3. Arrays.copyOf() 사용
		int[] arrCopy = {0,1,2,3,4};
		int[] arrResult1 = Arrays.copyOf(arrCopy, arrCopy.length);
		
		System.out.println(Arrays.toString(arrResult1));
		
		System.out.println();
		System.out.println("---------------------------------------------");
	
		
 	}
}
