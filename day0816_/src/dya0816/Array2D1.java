package dya0816;

public class Array2D1 {

	public static void main(String[] args) {
		//배열 초기화 1번 방법
		int[][] arr1 = new int[][] {{10, 20, 30},{40, 50, 60}};
		
		//배열 초기화 2번 방법
		int[][] arr2 = {{10, 20, 30},{40, 50, 60}};
		
		//배열 초기화 3번 방법
		int[][] arr3 = {
						{10, 20, 30},
						{40, 50, 60, 100000000},
						{70, 80, 90}
						};
		System.out.println(arr3[1][3]);
		
		int[][] arr4 = {
				{11,12,13,14,15},
				{25,26,27},
				{47,48,49,50},
				{88,89}
		};
		System.out.println(arr4[2][2]);
		System.out.println(arr4.length);
		System.out.println(arr4[3].length);
	}
}
