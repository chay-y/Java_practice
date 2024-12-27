package day0820;

class Card {

	String kind;	//인스턴스 변수
	int number;		//인스턴스 변수
	 
	static int width = 100;		//클래스 변수
	static int height = 250;	//클래스 변수
}

class Variables{
	
	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "visa";
		c1.number = 1234;
		
		Card c2 = new Card();
		c2.kind = "master";
		c2.number = 5678;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며 크기는 ("+c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며 크기는 ("+c2.width+", "+c2.height+")");
		
		//static 변수의 경우에는
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며 크기는 ("+c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며 크기는 ("+c2.width+", "+c2.height+")");
	
	}
}