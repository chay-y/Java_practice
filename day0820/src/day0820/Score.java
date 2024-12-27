package day0820;

public class Score {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	
	void eval_sum() {
		sum = kor+eng+math;
	}
	
	void eval_avg() {
		avg =(float)sum/3;
	}
	
	void print() {
		System.out.println("\n이름 : "+name+"\n국어 : "+kor+"\n영어 : "+eng+"\n수학 : "+math+"\n\n총점 : "+sum+"\n평균 : "+avg);
	}
}
