package day0830;

class CustomExcption extends Exception{
	public CustomExcption(double gas) {
		super (gas+"는 0보다 작습니다.");
	}
}
class Car{
	int num;
	double gas;
	
	Car(int num, double gas){
		this.num = num;
		this.gas = gas;
				
	}
	public void setCar(double gas)throws CustomExcption {
		if(gas<0) {
			throw new CustomExcption(gas);
		}
	}
}

public class Exception2 {
	public static void main(String[] args) {
		Car car1 = new Car(123,234.4);
		
//		try{
//			car1.gas = -10.1;
//		}catch(CustomExcption e) {
//			System.out.println(e);
//		}
	}
}
