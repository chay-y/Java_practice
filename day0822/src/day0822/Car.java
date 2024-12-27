package day0822;

public class Car {

	int num;
	double gas;
	
	Car(){
		System.out.println("자동차가 만들어졌어요!");
	}
	
	void setCar(int num, double gas) {
		this.num = num;
		this.gas= gas;
		System.out.println("차량번호 : "+num+", 연료량 : "+gas+"로 변경");
	}
	
	void show() {
		System.out.println("차량번호 : "+num);
		System.out.println("연료량 : "+gas);
	}
}
