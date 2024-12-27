package day0821;

public class OverTest1 {
	
	//매개변수로 2개를 입력받아서 합계를 계산
	int add(int x, int y) {
		System.out.println("int");
		return x+y;
	}
	
	float add(float x, float y) {
		System.out.println("float");
		return x+y;
	}
	
	String add(String x, String y) {
		System.out.println("String");
		return x+y;
	}
	
	int add(int[] x) {
		System.out.println("int[]");
		int result = 0;
		
		for (int i=0; i<x.length; i++) {
			result +=x[i];
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		OverTest1 ot = new OverTest1();
		
		int[]arr = {100,200,300};
		System.out.println(ot.add("a", "b"));
	}
}
