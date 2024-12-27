package day0902;

import java.util.StringTokenizer;

public class StringTokeniser1 {

	public static void main(String[] args) {
		
		String str = "안녕하세요,반갑습니다!곧,점심시간이에요";
		StringTokenizer st = new StringTokenizer(str,",!");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
