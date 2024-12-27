package day0827;

class Animal{
	protected String name;
	
	public void cry() {
		System.out.println(name+"가 소리를 낸다.");
	}
}

class Dog extends Animal{
	public void cry() {
		super.cry();
		System.out.println("멍멍!");
	}
	public void run() {
		System.out.println(name+"가 뛴다.");
	}
}

class Cat extends Animal{
	public void cry() {
		System.out.println(name+"가 소리를 낸다.");
		System.out.println("야옹~");
	}
	
	public void grooming() {
		System.out.println("그루밍을 한다.");
	}
}

class AnimalAction{
	public void action(Animal animal) {
		
		System.out.println(animal instanceof Dog);
		animal.cry();
		
		
		if (animal instanceof Dog) {
			((Dog) animal).run();
		}else if(animal instanceof Cat) {
			((Cat) animal).grooming();
		}
	}
	
//	public void action(Dog dog) {
//		dog.cry();
//		dog.run();
//	}
//	public void action(Cat cat) {
//		cat.cry();
//		cat.grooming();
//	}
}

public class AnimalMain {

	public static void main(String[] args) {
		AnimalAction a = new AnimalAction();
		
		Dog d = new Dog();
		d.name="멍멍이";
		a.action(d);
		
		Cat c = new Cat();
		c.name="야옹이";
		a.action(c);
	}
}
