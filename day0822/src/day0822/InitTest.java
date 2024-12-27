package day0822;

public class InitTest {
	
	//기본값 -> 명시적 초기화 -> 초기화블럭 -> 생성자
	
	//명시적 초기화
	int iv = 1;
	static int cv = 1;
	
	//초기화블럭
	{
		iv=2;
				}
	
	static {
		cv=2;
	}
	
	//생성자
	InitTest(){
		iv = 3;
	}
	
	
	public static void main(String[] args) {
		InitTest it = new InitTest();
		System.out.println(it.iv);
		System.out.println(InitTest.cv);
	}
}
