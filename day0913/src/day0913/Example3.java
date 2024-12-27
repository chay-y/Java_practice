package day0913;

@FunctionalInterface
interface Operator{
	
}

public class Example3 {
	private static int[] scores = {10, 90, 35};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		
		for(int score : scores) {
			result = operator.apply(result, score);
		}
	}
	
	public static void main(String[] args) {
		int max = maxOrMin((a,b)->{
			if(a>b) {
				return a;
			}else {
				return b;
			}
		});
		System.out.println("최대값 : "+max);
		
		int min = maxOrMin((a,b)->(a<b)? a:b);
		System.out.println("최소값 : "+min);
		
	}
}
