package day0910;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(3, "val");
		map.put(12, "val");
		map.put(2, "val");
		map.put(4, "val");
		map.put(86, "val");
		map.put(34, "val");
		map.put(43, "val");
		map.put(9, "val");
		map.put(58, "val");
		
		System.out.println(map.keySet());
		
		//ceilingEntry : 지정한 키 값보다 크거나 같은값 중 가장 작은 키의 entry를 반환
		System.out.println("ceilingEntry() : "+map.ceilingEntry(86));
		
		//ceilingKey : 지정한 키 값보다 크거나 같은값 중 가장 작은 키를 반환
		System.out.println("ceilingEntry() : "+map.ceilingKey(86));
		
		//floorEntry : 지정한 키 값보다 크거나 같은값 중 가장 큰 키의 entry를 반환
		System.out.println("ceilingEntry() : "+map.floorEntry(86));
		
		//floorKey : 지정한 키 값보다 크거나 같은값 중 가장 큰 키를 반환
		System.out.println("ceilingEntry() : "+map.floorKey(86));
		
		//replace(기존키, 변경할 값) : 기존키의 갑승ㄹ 지정된 값으로 변경
		System.out.println("replace() : "+map.replace(86,"val23"));
		
		//values() : 모든 값을 출력 
		System.out.println("replace() : "+map.values());
		
		System.out.println("===========================");
	
		Map.Entry<Integer, String>entry = null;
		
		//firstEntry() : map에 저장된 첫번째 키와 값을 반환(가장 낮은 값)
		entry=map.firstEntry();
		System.out.println("firstEntry() : "+entry.getKey()+"/"+entry.getValue());
		
		//lastEntry() : map에 저장된 마지막 키와 값을 반환(가장 큰 값)
		entry=map.lastEntry();
		System.out.println("lastEntry() : "+entry.getKey()+"/"+entry.getValue());
	
		//lowerEntry() : map에 저장된 마지막 키와 값을 반환(가장 큰 값)
		entry=map.lowerEntry(70);
		System.out.println("lowerEntry() : "+entry.getKey()+"/"+entry.getValue());
		
		while(!map.isEmpty()) {
			//pollFirstEntry() : map에서 가장 작은 키를 제거하면서 반환
			entry = map.pollFirstEntry();
			System.out.println(entry.getKey() + " / " + entry.getValue() + "남은 객체 수 : " + map.size());
		}
	}
}
