package d1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exam2 {

	public static void main(String[] args) {
		
		ArrayList lottoNums = new ArrayList();
		
		for(int i=1; i<=46; i++) {
			lottoNums.add((int)(Math.random()*45)+1);
		}

		System.out.println("모든 로또 번호 : "+lottoNums);
	
		ArrayList lotto = new ArrayList(lottoNums.subList(0, 6));
		System.out.println("로또 번호 : "+lotto);
	}
}

//중복허용
//46미포함