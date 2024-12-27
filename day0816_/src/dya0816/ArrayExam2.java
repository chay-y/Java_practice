package dya0816;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		//아래의 수 중에서 최대값과 최소값을 찾아서 출력
		
		int [] score = {23, 64, 34, 53, 42, 17, 43, 64, 23, 45};
		
		int max = score[0];
		int min = score[0];
		
		for (int i=0; i<score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+min);
        
 	}
}
