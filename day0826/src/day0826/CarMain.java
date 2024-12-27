//package day0826;
//
//class Car{
//	String color = "white";
//	int door = 4;
//	
//	void drive() {
//		System.out.println("달료");
//	}
//	
//	void stop() {
//		System.out.println("멈쵸");
//	}
//}
//
//class FireEngine extends Car{
//	void water() {
//		System.out.println("불꺼");
//	}
//}
//
//class Ambulance extends Car{
//	void siren() {
//		System.out.println("삐뽀");
//	}
//}
//
//public class CarMain {
//
//	public static void main(String[] args) {
//		FireEngine f = new FireEngine();
//		
//		System.out.println(f.color);
//		System.out.println(f.door);
//		f.drive();
//		f.stop();
//		f.water();
//	
//		System.out.println("=======");
//		
//		Car c =f;
//		
//		System.out.println(c.color);
//		System.out.println(c.door);
//		c.drive();
//		c.stop();
////		c.water(); 사용못함 .
////		c.siren(); 사용못함 .
//		
//		System.out.println("=======");
//		
//		FireEngine f2 = (FireEngine)c;
//		
//		System.out.println(f2.color);
//		System.out.println(f2.door);
//		f2.drive();
//		f2.stop();
//		f2.water();
////		f2.siren(); 사용못함. 
//		
//		System.out.println("=======");
//		
////		상속관계가 아니므로 클래스의 형변환 불가눙
////		Ambulance a = (Ambulance)f;
//		
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		
////		조상타입의 참조변수로 자손을 다루기때문에 형변환 생략이 가능함
////		조상타입 --형변환 생략--> 참조변수
//		car = fe;
////		car.water();
//		
////		자손타입의 참조변수로 조상을 다루기때문에 형변환 작성이 필요함
////		자손타입 --형변환 작성--> 조상타입 
//		fe2 = (FireEngine)car;
//		fe2.water();
//		
//		System.out.println("=======");
//		
//		Car car3 = null;
//		FireEngine Fe3 = new FireEngine();
//		
//		FireEngine fe4 = (FireEngine) car3;
//		Car car4 = (Car) fe3;
//		
//		car4.drive();
//		
//		Car car5 = new Car();
//		FireEngine fe5 =(FireEngine)car5;
//		fe5.water();
//		
//		
//	}
//	
//}
