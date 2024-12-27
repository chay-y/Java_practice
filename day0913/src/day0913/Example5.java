package day0913;

@FunctionalInterface
interface Operation2{
	int operate(int a, int b);
}

class Cal2{
	public int execute(int a, int b,Operation2 operation) {
	
		return operation.operate(a,b);
	}
}

public class Example5 {
	public static void main(String[] args) {
		
		Cal2 c = new Cal2();
		
		int result1 = c.execute(10,20,((a,b)->a+b));
		int result2 = c.execute(10,20,((a,b)->a-b));
		int result3 = c.execute(10,20,((a,b)->a*b));
		int result4 = c.execute(10,20,((a,b)->{
			if(b==0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}else {
				return a/b;	
			}
		}));
		
		System.out.println("10+20 ="+result1);
		System.out.println("10-20 ="+result2);
		System.out.println("10*20 ="+result3);
		System.out.println("10/20 ="+result4);
	}
}
