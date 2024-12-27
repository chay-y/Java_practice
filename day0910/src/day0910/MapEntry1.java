package day0910;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntry1 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			System.out.println("key : "+key);
			System.out.println("value : "+map.get(key));
		}
	
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> entry : entrySet){
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
	}
}
