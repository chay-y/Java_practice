package day0822;

public class Phone {

	String name;
	String spec;
	int cost;
	
	Phone(){}
	
	Phone(String name, String spec, int cost){
		this.name=name;
		this.spec=spec;
		this.cost=cost;
	}
	
	void phoneInfo() {
		System.out.println("제품명 : " +name); 
		System.out.println("스펙 : " +spec);
		System.out.println("가격 : " +cost);
	}
}
