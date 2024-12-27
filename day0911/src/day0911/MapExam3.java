package day0911;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;



public class MapExam3 {
	public static void main(String[] args) {
//		3개의 나라이름과 인구를 입력받아
//		가장 인구가 많은 나라를 검색하여 출력하시오
//		
//		입력값 예>공백으로 구분
//		한국5000
//		미국9000
//		중국20000
//		
//		출력값
//		가장 인구가 많은 나라는 중국,2000
		
		TreeMap<String, Integer> map = new TreeMap();
		
		
		Scanner sc = new Scanner(System.in);
		
		String contry;
		int pop;
			
//			for(int i=0; i<3; i++) {
//				System.out.println("나라와 인구를 입력하세요");
//				contry = sc.next();
//				pop = sc.nextInt();	
//				
//				map.put(pop,contry);
//			} 
//			Map.Entry<Integer, String>big = null;
//			big=map.lastEntry();
//			System.out.println("인구가 가장 많은 나라는 : "+big.getValue()+"/"+big.getKey());
	}
}
