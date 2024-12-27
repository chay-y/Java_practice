package day0902;

public class Wrapper1 {

	public static void main(String[] args) {
		
		//기본형을 객체로 저장
		Integer obj1 = 100;
		
		//문자열을 정수형 객체로 저장
		Integer obj2 = Integer.valueOf("200");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		//객체를 기본형으로 저장
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
	}
}
