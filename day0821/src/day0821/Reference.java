package day0821;

class Data{
	int x;
}

public class Reference {

	public static void main(String[] args) {
		data d = new data();
		d.x =10;
		System.out.println("main() : x = "+d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x);
		
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = "+d.x);
	}
}
