package day0909;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam3 {

	public static void main(String[] args) {
		
		//1~30사이의 숫자를 이용하여 빙고판을 생성하여
		//숫자가 중복되지 않도록 출력하시오.
		int[][] board = new int[5][5];
		Set set = new HashSet();
		
		for(int i=0; set.size()<25; i++) {
			int num = (int)(Math.random()*30)+1;
			set.add(num);
		}
		
		System.out.println(set);
		
		int index = 0;
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = (int) set.toArray()[index];
				index++;
			
				System.out.printf("%4d",board[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		ArrayList list = new ArrayList(set);
		
		Collections.shuffle(list);
		
		System.out.println(list);
		
		Iterator it = list.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = (int)it.next();
				System.out.printf("%4d",board[i][j]);
			}
			System.out.println();
		}
	}
}
