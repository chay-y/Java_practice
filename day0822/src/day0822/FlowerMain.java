package day0822;

class Flower{
	String name;
	int cost;
	
	Flower(){}
	
	Flower(String name, int cost){
		this.name=name;
		this.cost=cost;
	}
	
	void FlowerInfo() {
		System.out.println(name+" 1송이의 가격은 "+cost+"원 입니다.");
	}
}

class Rose extends Flower{
	Rose(){super();}
	
}

class Tulip extends Flower{
	Tulip(){super();}
}



public class FlowerMain {

	public static void main(String[] args) {
		Flower rose = new Flower("장미",1500);
		Flower tulip = new Flower("튤립",2000);
		
		rose.FlowerInfo();
		tulip.FlowerInfo();
		
		
	}
}
