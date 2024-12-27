package day0813;

public class OperationExam1 {
	public static void main(String[] args) {
		//1. 변수 num의 값에 따라'양수', '음수', '0' 을 출력하시오.
		//삼항연산자 사용
		
		int num = 10;
		System.out.println(num > 0 ?"양수":(num<0 ? "음수" : "0"));
		
		System.out.println("--------------------");
		
		double n = 14.23456;
		
		double result = Math.round(n * 1000) / 1000.0;
		
		System.out.println(result);
		
		
//		아래의 변수의 값 중에서 백의 자리 이하를 버리는 코드를 작성하시오.
//		만약 변수의 값이 456이라면 400이 되고
//		111이라면 100이 되도록 하시오.
		
		int n3 = 456;
		System.out.println(n3/100*100);
		
		System.out.println("--------------------");
		
//		상점에서 물건을 구매하고 영수증을 받았다.
//		영수증에는 10% 부가세와 잔돈이 인쇄되어 있다.
//		상품의 가격과 손님에게서 받은 금액을 변수에 저장하고
//		이에 대한 부가세와 잔돈을 계산하여 출력하시오
//		
//		받은돈 ; 10000
//		상품가격 ; 7500
//		부가세 ; 750
//		잔돈 ; 1750
		
		int money = 10000;
		int price = 7500;
		int tax =(int)(price*0.1);
		
		System.out.println("받은 돈 : "+money);
		System.out.println("상품 가격 : "+price);
		System.out.println("부가세 : "+tax);
		System.out.println("잔돈 : "+(money-(price+tax)));
		
		System.out.println("--------------------");
		
//		사과의 수가 123개이고, 하나의 바구니에는 10개의 사과를 담을 수 있다면
//		13개의 바구니가 필요할 것이다.
//		사과를 담는데 필요한 바구니의 수를 계산하시오.
		
		int apple = 123;
		int basket = 10;
		int basketNum = apple/basket +(apple%basket>0 ? 1 : 0);
		System.out.println(basketNum);
		
		System.out.println("--------------------");
		
//		화씨(f)를 섭씨(c)로 변환하시오
//		변환공식 : C = 5/9 * (F-32)
//		단, 1. 셋째자리에서 반올림하여 출력
//			2. Math.round()사용금지
		
		int f = 100;
		float c = (int) (((5/9f * (f - 32)) * 100) + 0.5) / 100f;
		System.out.println(c);
		
//		1. 값에 100을 곱한다. 37.7777778*100
//		2. 1의 결과에 반올림을 위해 0.5를 더하기 3777.77778 + 0.5
//		3. 2의 결과에 int타입으로 형 변환 (int) 3778.27778 -> 3778
//		4. 3의 결과를 100f로 나누면 됨(소수점 아래 필요없는 자리수들이 내림처리 됨)
		
		
		
		
	}
}
