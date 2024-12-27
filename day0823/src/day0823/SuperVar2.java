package day0823;

class Parent3{
	int x = 10;
}

class Child3 extends Parent2{
	int x = 20;
	
	void print() {
		System.out.println("x : "+x);
		System.out.println("child의 x :"+this.x);
		System.out.println("Parent의 x :"+super.x);
	}
}
public class SuperVar2 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.print();
	}
}
