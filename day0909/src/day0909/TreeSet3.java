package day0909;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet set =new TreeSet();
		int[] score = {80,65,95,36,74,59,45,12};
		
		//score배열의 값을 set에 저장
		for (int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println(set);
		
		//50보다 작은 값
		System.out.println("50보다 작은 값 : "+set.headSet(50));
		
		//50보다 큰 값
		System.out.println("50보다 큰 값 : "+set.tailSet(50));
		
		//40~60에 해당하는 값
		System.out.println("40~60에 해당하는 값 : "+set.subSet(40, 50));
	}
}
