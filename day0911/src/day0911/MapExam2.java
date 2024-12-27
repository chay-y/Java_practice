package day0911;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExam2 {

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
		
		Map<String, Integer> map = new HashMap();
		
		Scanner sc = new Scanner(System.in);
		
		String contry;
		int people;
			
			for(int i=0; i<3; i++) {
				System.out.println("나라와 인구를 입력하세요");
				contry = sc.next();
				people = sc.nextInt();	
				
				map.put(contry,people);
			}
			
//			int bigPop = 0;
//			String bigNatrion = null;
//			
//			Set<Integer> pops = map.keySet();
//			
//			Iterator<Integer> it = pops.iterator();
//			
//			while(it.hasNext()) {
//				Integer pop = it.next();
//				String name = map.get(pop);
//				
//				if(pop>bigPop) {
//					bigPop = pop
//				}
//			}
		
		
	}
}
