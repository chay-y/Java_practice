package day0904;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam4 {

	public static void main(String[] args) {
		//ArrayList를 이용하여 로또 번호 추출
		
		ArrayList lottoNums = new ArrayList();
		
		for(int i=1; i<=45;i++) {
			lottoNums.add(i);
		}
		
//		System.out.println("전체번호 : "+lottoNums);
		
		Collections.shuffle(lottoNums);
		
//		System.out.println("랜덤으로 뒤섞인 번호 : "+lottoNums);
		
		ArrayList lotto = new ArrayList(lottoNums.subList(0, 6));
		System.out.println("로또 번호 : "+lotto);
	}
}
