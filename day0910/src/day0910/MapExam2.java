package day0910;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExam2 {

	public static void main(String[] args) {
		//학생의 이름과 점수를 이용하여
		//령균점수를 출력하고
		//최고점수를 가진 학생의 이름과 점수,
		//최저점수를 가진 학생의 이름과 점수를 나타내시오
		
		//이름		점수
		//green		96
		//summer	86
		//blue		92
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		map.put("green",96);
		map.put("summer",86);
		map.put("blue",92);
	
		
		int sum = 0;
		int avr = 0;
		
		for(Map.Entry<String, Integer>entry:map.entrySet()) {
			sum += entry.getValue();
		}
		avr += sum/map.size();

		System.out.println("학생들의 평균 점수 : "+avr);
		
		Entry<String, Integer>entry = null;
		
		entry=map.firstEntry();
		System.out.println("최고점수 학생 : "+entry.getKey()+" / 점수 : "+entry.getValue());
		
		entry=map.lastEntry();
		System.out.println("최저점수 학생 : "+entry.getKey()+" / 점수 : "+entry.getValue());
		
	}
}
