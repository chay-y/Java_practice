package day0903;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExam1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);
		
		//addAll() : 컬렉션에 값을 추가
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		System.out.println();
		
		//rotate() : 오른쪽으로 값을 이동
		Collections.rotate(list, 2);
		System.out.println(list);
		
		//swap() : 해당 인덱스의 값들을 교환
		Collections.swap(list, 0, 2);
		System.out.println(list);
		
		//shuffle() : 임의로 섞기
		Collections.shuffle(list);
		System.out.println(list);
		 
		//sort() : 오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		//정렬된 순서를 뒤집기
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		//binarySearch() : 지정된 인덱스의 값을 출력
		//반드시 정렬되어있어야 함
		int idx=Collections.binarySearch(list,3);
		System.out.println(idx);
		
		//max : 최대값 //min : 최소값
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		//fill() : 지정된 값으로 해당 리스트를 채움
		Collections.fill(list,9);
		System.out.println(list);
		
		//nCopies() : 새로운 list를 생성
		//list의 size와 같은 크기의 새로운 list를 생성하고 2로 값을 채움
		
		List newList = Collections.nCopies(list.size(),2);
		System.out.println("newList : "+newList);
		
		System.out.println(Collections.disjoint(list, newList));
		
		Collections.copy(list, newList);
		System.out.println("list : "+list);
		System.out.println("new : "+newList);
		
		//replaceAll() : 내용 변경. 2를 모두 1로 변경
		Collections.replaceAll(list, 2, 1);
		System.out.println(list);
		
	}
}
