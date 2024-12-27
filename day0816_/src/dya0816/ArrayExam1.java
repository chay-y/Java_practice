package dya0816;

public class ArrayExam1 {
	
	public static void main(String[] args) {
		//아래 점수의 합계와 평균을 계산하여 나타내시오
		
		int [] score = {93, 68, 72};
		int sum = 0;
		
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		double avg = (double)sum / score.length;
		
		System.out.println("합계 점수 : "+sum);
		System.out.println("평균 점수 : "+avg);
		
	}
}
