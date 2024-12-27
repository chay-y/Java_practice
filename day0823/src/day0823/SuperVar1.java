package day0823;

class Parent2{
	int x = 10;
}

class Child2 extends Parent2{
	int x = 20;
	
	void print() {
		System.out.println("x : "+x);
		System.out.println("child의 x :"+this.x);
		System.out.println("Parent의 x :"+super.x);
	}
}
public class SuperVar1 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.print();
	}
}
