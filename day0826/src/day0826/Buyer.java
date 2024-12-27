package day0826;

import java.util.Arrays;

public class Buyer {

	int money = 10000;
	int bonusPoint = 0;
	
//	void buyTv(Tv t) {
//		if(money < t.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//	money -= t.price;
//	bonusPoint += t.bonusPoint;
//	
//	System.out.println("tv를 구매하였습니다");
//	}
//	
//	void buyCom(Computer c) {
//		if(money < c.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//	money -= c.price;
//	bonusPoint += c.price;
//	
//	System.out.println("컴퓨터를 구매하였습니다");
//	}
//	
//	void buyAudio(Audio a) {
//		if(money < a.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//	money -= a.price;
//	bonusPoint += a.bonusPoint;
//	
//	System.out.println("오디오를 구매하였습니다");
//	}
	int i = 0;
	Product[] cart = new Product[10];

	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money-=p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		
//		System.out.println(Arrays.toString(cart));
		
		System.out.println(p+"를 구입하셧습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) {
				break;
			}
			sum +=cart[i].price;
			itemList += cart[i]+"";
		}
		System.out.println("물품의 총 금액 : "+sum+"만원");
		System.out.println("구매한 제품 : "+itemList);
	}
}
