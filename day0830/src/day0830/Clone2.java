package day0830;

class CloneTest implements Cloneable{
	
	public int x;
	public int y;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class Clone2 {

	public static void main(String[] args) {
		
		//깊은 복사
		//'값'을 새로운 메모리 공간에 복사
		//복사한 후에 원본값이 변경되더라도 복사한 값은 유지
		//얕은 복사에 비해 메모리 소요가 크고 속도가 느림
		CloneTest c1 = new CloneTest();
		CloneTest c2 = null;
		
		try {
			c2=(CloneTest)c1.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		c1.x = 30;
		c1.y = 40;
		
		c2.x = 20;
		c2.y = 10;
		
		System.out.println("c1.x : "+c1.x);
		System.out.println("c1.y : "+c1.y);

		System.out.println("c2.x : "+c2.x);
		System.out.println("c2.y : "+c2.y);
	}
}
