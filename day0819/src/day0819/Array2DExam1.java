package day0819;

import java.util.Arrays;

public class Array2DExam1 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 52, 89},
				{84, 54, 51},
				{100, 84, 43},
				{90, 45, 23},
				{40, 64, 12}
		};
//		double num = 10.12345;
//		System.out.printf("%2.1f",num);
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호  국어  영어  수학  총점  평균\n==============================");
		
		for(int i=0; i<score.length; i++) {
			
			korTotal += score [i][0];
			engTotal += score [i][1];
			mathTotal += score [i][2];
			
			System.out.printf("%3d", i+1);
			
			int sum = 0;
			float avg = 0.0f;
			
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%5d",score[i][j]);
				sum += score[i][j];
			}
			
			avg = (float) sum / score[i].length;
			
			System.out.printf("%5d %5.1f \n", sum, avg);
		}
		System.out.println("==============================");
		
		float korAvg = (float)korTotal / score.length;
		float engAvg = (float)engTotal / score.length;
		float mathAvg = (float)mathTotal / score.length;
		
		System.out.printf("총점 %4d %4d %4d \n", korTotal, engTotal, mathTotal);
		System.out.printf("평균 %3.1f %3.1f %3.1f \n", korAvg, engAvg, mathAvg);
		
	}
}
