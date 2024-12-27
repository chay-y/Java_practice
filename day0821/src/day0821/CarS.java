package day0821;

public class CarS {
	int num;
	double gas;
	static int sum = 0;
	
	void setCars(int n, double g) {
		num = n;
		gas = g;
		sum++;
		System.out.println("자동차가 생성되었습니다.");
	}
	void showS() {
		System.out.println("차량번호 : "+num);
		System.out.println("연료량 : "+gas);
	}
	
	//클래스 메서드(static 메서드)
	static void showSum() {
		System.out.println("차량 수 : "+sum);
	}
}
