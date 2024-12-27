package day0830;

class Test1{
	public int x;
	public int y;
}

class Test2{
	
	@Override
	public String toString() {
		return "toString() 재정의";
	}
}

public class ToString1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("t1 :"+t1);
		System.out.println("t1.toString() : "+t1.toString());
		
		System.out.println("");
		
		Test2 t2 = new Test2();
		System.out.println("t2 :"+t2);
		System.out.println("t2.toString() : "+t2.toString());
	}
}
