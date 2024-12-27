package day0822;

class Food{
	String name;
	int price;
	
	Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
}

public class FoodMain {
	public static void main(String[] args) {
		Food chicken = new Food("치킨",19800);
		Food pizza = new Food("피자",28700);
		System.out.printf("Food{name : %s, price : %d원}\n",chicken.getName(), chicken.getPrice());
		System.out.printf("Food{name : %s, price : %d원}\n",pizza.getName(), pizza.getPrice());

	}
}
