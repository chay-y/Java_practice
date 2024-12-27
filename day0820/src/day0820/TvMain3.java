package day0820;

public class TvMain3 {
	
	public static void main(String[] args) {
		//길이가 3인 Tv객체 배열 생성
		//Tv객체의 각 요소에는 채널을 10, 11, 12번으로 설정
		
		Tv[] tvArr = new Tv[3];
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
			System.out.printf("tvArr[%d].channel=%d\n",i,tvArr[i].channel);
		}
	}
}
