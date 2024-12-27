package day0910;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김그린", 94);
		map.put("이자바", 20);
		map.put("정디비", 50);
		map.put("이자바", 100);
		
		System.out.println("총 객체수 : "+map.size());
		
		//객체 찾기
//		System.out.println("  이자바의 점수 : "map.get("이자바") );
		System.out.println();
		
		//키를 확인
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIt = keySet.iterator();
		
		while(keyIt.hasNext()) {
			String key = keyIt.next();
			Integer value = map.get(key);
			System.out.println("   "+key+" : "+value);
		}
		System.out.println();
	
		//객체 삭제
		map.remove("정디비");
		
		System.out.println("총 객체수 : "+map.size());
	
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String key=entry.getKey();
			Integer value = entry.getValue();
			System.out.println("   "+key+" : "+value);
		}
		System.out.println();
	}
}
