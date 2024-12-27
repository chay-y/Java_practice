package d2;

//해당 클래스 안에 요구사항에 맞는 메소드를 구현하시오.
interface MathUtil {
	
   boolean isEven(int a, int b, int c);
   double getSumFromOne(int num);
   int getArraySum(int a, int b, int c);
   
}

class MathUtilImpl implements MathUtil{
	
	int a;
	int b;
	int c;
	//매개변수로 받은 세 수의 합이 짝수이면서
	  //동시에 5의 배수일 경우에만 리턴 true
	@Override
	public boolean isEven(int a, int b, int c) {
		if((a+b+c)%2==0 && (a+b+c)%5==0) {
			System.out.println("세 수의 합이 짝수,5의 배수입니다.");
			return true;
		}else {
			System.out.println("세 수의 합이 짝수,5의 배수가 아닙니다.");
			return false;
		}
  }

   //1부터 매개변수로 받은 수까지의 합을 리턴
	@Override
	public double getSumFromOne(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
		  sum += i;		  
		}
		System.out.println("1부터 해당 수 까지의 합 :"+sum);
		return sum;
  }

  //아래 요구사항을 만족하는 getArraySum()메소드를 정의하시오.
  //매개변수로 정수형 배열이 들어오면
  //해당 배열의 모든 요소의 합을 리턴
	@Override
	public int getArraySum(int a, int b, int c) {
		int[] arr = {a, b, c};
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		System.out.println("정수 배열의 합 : "+sum);
		return sum;
	}

	public static void main(String[] args) {
		MathUtil n;
		n= new MathUtilImpl();
		n.isEven(20, 10, 40);
		n.getSumFromOne(5);
		n.getArraySum(3, 12, 56);
	}
}



