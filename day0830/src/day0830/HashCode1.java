package day0830;

public class HashCode1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//hashCode() : 객체를 식별하는 하나의 정수값을 의미함
		//identityHashCode() : 객체마다 다른 해쉬코드를 반환할것을 보장
		//오버라이딩하기전의 hasdCode()가 필요한 경우에 사용
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
