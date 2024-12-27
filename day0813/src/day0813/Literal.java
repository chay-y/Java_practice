package day0813;

public class Literal {
	public static void main(String[] args) {
		
		//2진수 0b, 8진수 0, 10진수, 16진수 0x ``` 숫자 앞에 붙여서 몇진수인지 정의함
		int var1 = 0b1111;
		int var2 = 0206;
		int var3 = 345;
		int var4 = 0xA3;
		
		//캐릭터 타입```char : 하나의 문자를 ''로 저장할 수 있는 타입
		char ch = '\uACBA';
		char ch2 = 65; //아스키코드
		char ch3 = '\u0041'; //유니코드
		
		char ch4 = '\uC774';
		char ch5 = '\uC608';
		char ch6 = '\uC9C4';
		
		
		System.out.println("var1 : "+ var1);
		System.out.println("var2 : "+ var2);
		System.out.println("var3 : "+ var3);
		System.out.println("var4 : "+ var4);
		
		System.out.println("ch : "+ch);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		
		System.out.println("이름 : "+ch4+ch5+ch6);
	}
}
