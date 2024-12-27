package day0813;

public class Casting3 {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		//char값을 계산하면 int로 변환되면서 유니코드에 해당하는 숫자로 처리됨.
		//int를 다시 문자로 출력하려면 char로 형변환을 해주면 됨\
		char charValue1 = 'A';
		char charValue2 = 1;
		
		int intValue2 = charValue1 + charValue2;
		
		System.out.println(intValue2); //유니코드
		System.out.println((char)intValue2); //문자열로 다시변경
		
		int intValue3 = 10;
		int intvalue4 = intValue3 / 4;
		float floatValue = intValue3 / 4.0f; //4.0은 double로 취급되기때문에 float을 적용시켜주기 위해 실수뒤에 f를 붙여줌
		
		System.out.println(intvalue4); //정수를 정수로나눠서 값을 정수로 표현했기때문에 2.5가 아닌 2가 나옴
		System.out.println(floatValue);
		
		int x = 1; //4
		int y = 2; //4
		double result = x / y; //정수와 정수를 나눈것을 실수에 담았음으로 0.0(실수)으로 나옴
		double result2 = (float)x / y; //float로 형변환을 해줬음으로 실수와 실수(큰 값을 따라가므로...)를 나눈것으로 취급되므로 0.5로 나옴
		
		System.out.println(result);  //0.0(실수)```정수/정수=>실수
		System.out.println(result2);  //0.5(실수)```실수/정수(=큰값따라가서 실수로취급)=>실수
		
		String value = "10" + (2 + 3); //문자열의경우 앞의 문자열을 따라가기때문에 따로 연산을 원한다면 ()로 묶어서 분리해주어야함 ```괄호를 최우선적으로 연산함
		System.out.println(value);  // "문자열"+연산 = "10"+(5) = "10"5
		
		char c1 = 'a';
		int c2 = c1 + 1;
		System.out.println((char)c2);
		char c3 = (char)(c1+1);
		System.out.println(c3);
	}
}