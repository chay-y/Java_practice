package day0909;

import java.util.Stack;

class Coin{
	int value;
	
	public Coin(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
}

public class Stack1 {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		System.out.println(coinBox.peek().getValue());
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coinBox.peek().getValue());
		}
	
	}
}
