package day0823;

class Bus {
	public int num;
	public int count;
	
	public void setNumcount(int num, int count) {
		if (count>=0 && count<=45) {
			this.num=num;
			this.count=count;
			System.out.printf("차량 번호 : %d, 탑승 인원 : %d로 설정함\n",num,count);
		}else {
			System.out.println("올바른 탑승인원이 아닙니다.");
		}
	}
	
	public void show() {
		System.out.println("차량 번호 : "+num);
		System.out.println("탑승 인원 : "+count);
	}
}

public class BusMain {

	public static void main(String[] args) {
		Bus bus = new Bus();
//		bus.num = 2300;
//		bus.count = 10;
		
		bus.setNumcount(2344, 13);
		
		bus.show();
		
	}
}
