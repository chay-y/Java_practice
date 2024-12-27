package day0910;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapExam3 {

	public static void main(String[] args) {
		//영어단어맞추기 게임을 제작
		
		//단어 목록을 만들어두고
		HashMap<String, String> dic = new HashMap<>();
		
		dic.put("apple", "사과");
		dic.put("baby", "아기");
		dic.put("curcle", "원");
		dic.put("deer", "숫사슴");
		dic.put("eyes", "눈");
		dic.put("feather", "깃털");
		
//		System.out.println(map.keySet());
//		System.out.println(map.entrySet());
		
		//찾고싶은 영어를 입력하면
		//뜻을 출력
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾고 싶은 영어 단어를 입력하세요\n(종료는 exit)>>");
			String eng = sc.nextLine();
			
			if(eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String kor = dic.get(eng);
			
			if(kor == null) {
				System.out.println("--> "+eng+"은 없는 단어입니다.");
			}else {
				System.out.println("--> "+kor);
			}
			
			System.out.println("================");
		}
		
		
		//없는 단어를 입력하면
		//단어가 없다고 출력
		
		//exit를 입력하면
		//종료
		
		
	}
}
