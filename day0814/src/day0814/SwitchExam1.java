package day0814;

public class SwitchExam1 {
	public static void main(String[] args) {
		//현재 시각에 따라 스케줄을 표시
		//8~12시 사이에 출근
		//출근 시간은 랜덤으로 설정

		//8시 출근
		//9시 회의
		//10시 외근
		//나머지 시간 업무
		
		int time = (int) (Math.random()*5)+8;
		System.out.println(time + "시");
		
		switch(time) {
		
		case 8 : System.out.println("출근합니다.");
		
		case 9 : System.out.println("회의를 합니다.");
		
		case 10 : System.out.println("외근을 갑니다.");
		
		default : System.out.println("업무를 봅니다.");
		
		}
	
	}
}
