package day0819;

import java.util.Arrays;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		int[] arr = new int [10];
		int[] num = new int [10];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*9);
		}
		System.out.println(Arrays.toString(arr));
		
		
		for (int i=0; i<arr.length; i++) {
			num[arr[i]]++;
		}
		for (int i=0; i<arr.length; i++) {
			System.out.println(i+"의 개수 : "+num[i]);
		}
	}
}
