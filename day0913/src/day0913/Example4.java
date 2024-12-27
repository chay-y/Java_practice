package day0913;

@FunctionalInterface
interface Operation{
	int operate(int a, int b);
}

class Cal{
	public int execute(Operation2 operation) {
		int a = 10;
		int b = 20;
		
		return operation.operate(a,b);
	}

	
	public static void main(String[] args) {
	
		Cal c = new Cal();
		
		int result1 = c.execute((a,b)->a+b);
		int result2 = c.execute((a,b)->a-b);
		int result3 = c.execute((a,b)->a*b);
		int result4 = c.execute((a,b)->{
			if(b==0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return a/b;
		});
		
		System.out.println("10+20 ="+result1);
		System.out.println("10-20 ="+result2);
		System.out.println("10*20 ="+result3);
		System.out.println("10/20 ="+result4);
	}
}
