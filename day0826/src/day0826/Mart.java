package day0826;

public class Mart {

	public static void main(String[] args) {
		Buyer b =new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("잔액 : "+b.money);
		System.out.println("보너스 포인트 : "+b.bonusPoint);
		b.summary();
	}
}
