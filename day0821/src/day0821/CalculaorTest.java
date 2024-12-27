package day0821;

public class CalculaorTest {
	
	public static void main(String[] args) {
		
		Calculaor rec = new Calculaor();
		
	
		int result1 = rec.areaRectangle(10);
		int result2 = rec.areaRectangle(10,20);
		
		System.out.println("정사각형의 넓이 : "+result1);
		System.out.println("직사각형의 넓이 : "+result2);
	}

}
