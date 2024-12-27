package day0823;

final class Animal{
	
	String name;
	String color;
	int age;
	
	static int count = 0;
	
	Animal(){}
	
	Animal(String name, String color, int age){
		this.name=name;
		this.color=color;
		this.age=age;
		count++;
	}
}

//class Dog extends Animal{
//	
//}

public class AnimalMain {

	
	public static void main(String[] args) {
		Animal a1 =new Animal("댕댕이","흰색",3);
		Animal a2 =new Animal("댕댕이","흰색",3);
		
		System.out.println("총 반려동물의 수 : "+Animal.count);
	}
}
