package day0820;

public class TvMain2 {

	public static void main(String[] args) {
//		int[] score = new int [5];
		
		//1.객체를 생성하고 각 요소에 저장
		Tv[] tvArr1 = new Tv[3];
		tvArr1[0] = new Tv();
		tvArr1[1] = new Tv();
		tvArr1[2] = new Tv();
				
		//2. 객체 초기화 블럭을 사용
		//int[] score = {1,2,3,4,5};
		Tv[] tvArr2 = {new Tv(), new Tv(), new Tv()};
		
		//다뤄야할 객체 배열이 많으면 for문 이용
		//Tv배열 100칸
		Tv[] tvArr3 = new Tv[100];
		for(int i=0; i<100; i++) {
			tvArr3[i] = new Tv();
		}
				
	}
}
