package day0820;

import java.util.Scanner;

public class AreaMain {
	public static void main(String[] args) {
		
		AreaCalculate cal = new AreaCalculate();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 입력>");
		int a = scan.nextInt();
		
		System.out.print("세로 입력>");
		int b = scan.nextInt();
		
		int result1 = cal.areaResult(a,b);
		System.out.println("가로길이가 "+a+"이고, 세로길이가 "+b+"인 직사각형의 면적은 "+result1+"입니다.");
		
		
}
}
