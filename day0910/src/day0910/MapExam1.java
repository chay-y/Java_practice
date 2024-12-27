package day0910;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapExam1 {

	public static void main(String[] args) {
		//사용자에게 아이디와 비밀번호를 입력받아 로그인하도록 하시옹
		
		//아이디	비밀번호
		//spring	12
		//summer	1234
		//fall	123
		//winter	12345
		
		//입력후 summer의 비밀번호를 123으로 변경함
		
		//아이디와 비밀번호가 동일하게 입력되었다면 '로그인되었습니다'출력
		//아이디가 잘못되었으면 '입력하신 아이디가 존재하지 않습니다'출력
		//비밀번호가 일치하지 않으면 '비밀번호가 일치히지 않습니다'출력
		
		TreeMap<String, Integer> userInfo = new TreeMap<>();
		
		
		userInfo.put("spring", 12);
		userInfo.put("summer", 1234);
		userInfo.put("fall", 123);
		userInfo.put("winter", 12345);
		
		userInfo.put("summer", 123);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.print("아이디를 입력하세요 >> ");
			String Id = sc.nextLine();
				
			System.out.print("비밀번호를 입력하세요 >> ");
			int Pw = sc.nextInt();
			
			if(userInfo.containsKey(Id)) {
				if(userInfo.get(Id).equals(Pw)){
					System.out.println("로그인되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		
//			TreeMap<String, Integer> userWrite = new TreeMap<>();
//			userWrite.put(Id, Pw);
//				
//			Iterator<Map.Entry<String, Integer>>entry1 = userInfo.entrySet().iterator();
//			Iterator<Map.Entry<String, Integer>>entry2 = userWrite.entrySet().iterator();
//				
//			while(entry1.hasNext() && entry2.hasNext()){
//				Map.Entry<String, Integer> uI = entry1.next();
//				Map.Entry<String, Integer> uW = entry2.next();
//				
//				System.out.println(uI.getKey()+"/"+uI.getValue());
//				System.out.println(uW.getKey()+"/"+uW.getValue());
//				if(uI.getKey() == uW.getKey() && uI.getValue() == uW.getValue()) {
//					System.out.println("로그인되었습니다.");
//				}else if(uI.getKey() != uW.getKey() && uI.getValue() == uW.getValue()) {
//					System.out.println("비밀번호가 일치하지 않습니다.");
//				}else if(uI.getKey() != uW.getKey()) {
//					System.out.println("입력하신 아이디가 존재하지 않습니다.");
//				}
//			}
		}
		
			
	}
}
