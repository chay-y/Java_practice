package day0821;

public class CarI {
	int num;
	double gas;
	
	void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량번호 : "+num);
		System.out.println("연료량 : "+gas+"로 변경");
	}
	
	void showI() {
		System.out.println("차량번호 : "+num);
		System.out.println("연료량 : "+gas);
	}
}
