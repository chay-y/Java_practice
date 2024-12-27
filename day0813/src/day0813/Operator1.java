package day0813;

public class Operator1 {
	public static void main(String[] args) {
//		int i=5, j=0;
//		j=i++;
//		System.out.println("i++ 실행 후 i = "+i+", j = "+j);
//		
//		i=5;
//		j=0;
//		j= ++i;
//		System.out.println("++i 실행 후 i = "+i+", j = "+j);
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------");
		
		x++;
		++x;
		System.out.println("x = "+x); //12
		
		System.out.println("---------------");
		
		y--;
		--y;
		System.out.println("y = "+y); //8
		
		System.out.println("---------------");
		
		z = ++x;
		System.out.println("z = "+z); //13
		System.out.println("x = "+x); //13
		System.out.println("y = "+y); //8
	}
}
