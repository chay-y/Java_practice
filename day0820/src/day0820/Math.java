package day0820;

public class Math {

	int add(int x, int y) {
		int sum = x+y;
		return sum;
	}
	
	int max(int a, int b) {
		int result = 0;
		if (a>b) {
			result=a;
		}else if (a<b) {
			result=b;
		}else if (a==b) {
			result=1;
		}
		return result;
				
	}
}
