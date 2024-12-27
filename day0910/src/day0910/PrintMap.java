package day0910;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrintMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
	
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		
		System.out.println("1. entrySet() : Key와 value를 가져올 때 사용");
		for(Map.Entry<Integer, String>entry:map.entrySet()) {
			System.out.println("   "+entry.getKey()+"/"+entry.getValue());
		}
		
		System.out.println();
		System.out.println("2. KeySet() : Key를 가져올 때 사용");
		for(Integer i : map.keySet()) {
			System.out.println("   "+i + "/"+map.get(i));
		}
		
		System.out.println();
		System.out.println("3. Iterator() : 컬렉션에 저장된 요소들을 읽어오는 방법");
		System.out.println("3-1. Iterator ~ entrySet()");
		Iterator<Map.Entry<Integer, String>>entry = map.entrySet().iterator();
		
		while(entry.hasNext()) {
			Map.Entry<Integer, String> e =entry.next();
			System.out.println("   "+e.getKey()+"/"+e.getValue());
		}
	
		System.out.println();
		System.out.println("3-2. Iterator ~ keySet()");
		
		Set keySet = map.keySet();
		
		Iterator<Integer> keys = keySet.iterator();
		
		while(keys.hasNext()) {
			int k = keys.next();
			System.out.println("   "+k+"/"+map.get(k));
		}
		
	}
}
