package day0822;

public class Con1 {
	
	int x;
	Con1(){
		this(1000);
		x=10;
		System.out.println("매개변수가 없는 생성자");
		System.out.println("Con1이 가지고있는 x의 값 : "+this.x);
	}
	
	Con1(int x){
		this.x = x;
		System.out.println("매개변수가 1개인 생성자");
		System.out.println("Con1이 가지고있는 x의 값 : "+this.x);
	}
	
	public static void main(String[] args) {
		Con1 c = new Con1();
		System.out.println(c.x);
	}
}
