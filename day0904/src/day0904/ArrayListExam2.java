package day0904;

import java.util.ArrayList;
import java.util.Scanner;

class Item{
	String name;
	int price;
	
	public Item(String name,int price){
		this.name=name;
		this.price=price;
	}
	
	public String toStr(){
		return "Item { name : "+name+", price : "+price+"원 }";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Item[ name : %s, price : %d ]",name,price);
	}

	public int getPrice() {
		return price;
	}

}

public class ArrayListExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		Item shirt = new Item("티셔츠",49900);
		Item pants = new Item("면바지",58900);
		Item sneakers = new Item("스니커즈",46900);
		
		ArrayList<Item> cart = new ArrayList<Item>();
		cart.add(shirt);
		cart.add(pants);
		cart.add(sneakers);
		
		int sum = 0;
		
		for(int i=0; i<cart.size(); i++) {
			Item item = cart.get(i);
			sum += item.getPrice();
		}
		
		System.out.println();
		System.out.println("----------------총 금액-----------------");
		System.out.println("               "+sum+"원");
		
		
	}
}
