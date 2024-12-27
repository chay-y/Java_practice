package day0813;

public class Casting1 {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //자동 타입 변환됨
		System.out.println("intValue : "+ intValue);
		
		//char => int로 자동형변환이 되면 유니코드의 값이 int에 저장됨
		char charValue = '가';
		intValue = charValue;
		System.out.println("가 : "+intValue);
		
		
		//char의 허용범위에 음수가 포함되지 않으므로
		//byte의 값을 저장할 수 없음
		byteValue = 65;
		// charValue = byteValue;
		
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : "+longValue);
		
		//8byte의 long보다 4byte의 float이 표현 범위가 더 넓음
		//```지수형식으로 값을 저장하기 때문```
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : "+floatValue);
		
		floatValue = 100.3f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : "+doubleValue);
	}
}
