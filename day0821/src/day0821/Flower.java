package day0821;

public class Flower {

	String name;
	int cost;
	
	//기본생성자
	public Flower(){
//		this.name = "미정";
//		this.cost = 1000;
		this("미정",500);
		System.out.println("매개변수가 없는 생성자");
	}
	public Flower(String name){
//		this.name = "미정";
//		this.cost = 1000;
		this(name,500);
	}
	public Flower(String name, int cost){
		this.name = name;
		this.cost = cost;
	}
	
	void flowerInfo() {
		System.out.println(name+" 한송이의 가격은 "+cost+"원 입니다.");
	}
}
