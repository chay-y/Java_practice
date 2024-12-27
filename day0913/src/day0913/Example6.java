package day0913;

@FunctionalInterface
interface Operation3{
	int operate(int a, int b);
}

class Cal3{
	
	public int execute(int a, int b,Operation2 operation) {
		return operation.operate(a,b);
	}
	
	public static void main(String[] args) {
	
		Cal3 c = new Cal3();
		
		Operation3 add= ((a,b)->a+b);
		System.out.println("10+20="+add.operate(10, 20));
		
		Operation3 subtract = ((a,b) -> a-b);
		System.out.println("10-20="+subtract.operate(10, 20));
		
		Operation3 multy = ((a,b) -> a*b);
		System.out.println("10*20="+multy.operate(10, 20));
		
		Operation3 divide = ((a,b)->{
			if(b==0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return a/b;
		});
		System.out.println("10-20="+divide.operate(10, 20));
	}
	
}
