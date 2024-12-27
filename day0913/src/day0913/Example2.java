package day0913;

import java.util.function.Function;

public class Example2 {

	public static double calc(Function<T, R> fun) {
		double x = 10;
		double y = 4;
		
		return fun.apply(x, y);
	}
	
	public static void main(String[] args) {
		System.out.println("result : "+result);
	}
}
