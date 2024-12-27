package d2;

class Calculate{
	
	//Calculate 클래스의 두가지 정수 데이터
	int num1;
	int num2;
	
	//Calculate 클래스의 4가지 기능
	
	void setNumber(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	int getSum() {
		return num1+num2;
	}
	
	int getMax() {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	double getAvg() {
		
		double a = 0;
		
		if(num1>num2) {
			for(int i=num2+1; i<num1; i++) {
				a += i;
			}
		a /= (num1-(num2+1));
		}else if(num1<num2) {
			for(int i=num1+1; i<num2; i++) {
				a += i;	
			}	
		a /= (num2-(num1+1));	
		}
		
		return a;
	}
	
}

public class CalTest {

	public static void main(String[] args) {
		
		Calculate A = new Calculate();
		
		A.setNumber(738,212);
		System.out.println("정수의 합 > "+A.getSum());
		System.out.println("두 수중 큰 수 > "+A.getMax());
		System.out.println("두 정수 사이 정수들의 평균 > "+A.getAvg());
		
	}
}


