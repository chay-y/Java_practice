package day0822;

public class RacingCar extends Car {
	int course;
	
	//자식생성자를 호출하게 되면
	//무조건 부모생성자를 먼저 호출함
	RacingCar(){
		super();
		System.out.println("레이싱 카가 만들어졌어요");
	}
	
	void setCource(int course) {
		this.course = course;
		System.out.println("코스번호를 "+course+"로 설정");
	}
}
