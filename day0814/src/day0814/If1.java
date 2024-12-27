package day0814;

public class If1 {
	public static void main(String[] args) {
		String str = "C";
		char ch = 'c';
		
		System.out.println((ch=='c')||(ch=='C')); //true
		// System.out.println((str=='c')||(str=='C')); //에러. 자료형 불일치
		System.out.println((str.equals("c"))||(str.equals("C")));
		System.out.println(str.equalsIgnoreCase("C"));
		
		char num = '4'; //아스키코드52
		System.out.println(num >= '0' && num <= '9'); //48이상 57이하
		System.out.println(num < '0' || num > '9'); //입력받은 문자 4가 숫자인지 아닌지 확인
		
		String a= "안녕하세요";
		System.out.println(a.charAt(2));
		
		//문자열3 (String)을 문자3(char)로 변경
		String s = "3";
		
		if (s!=null && !s.equals("")) {
			ch = s.charAt(0);
		}
		System.out.println(ch);
		
		//문자형을 숫자로 만드는 법
		//문자형에 문자 '0'을 뺀다
		
		System.out.println('3' - '0');
	}
}
