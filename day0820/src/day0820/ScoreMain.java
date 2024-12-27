package day0820;

public class ScoreMain {

	public static void main(String[] args) {
		Score data1 = new Score();
		Score data2 = new Score();
		
		data1.name = "유재석";
		data1.kor = 70;
		data1.eng = 80;
		data1.math = 90;
		
		data1.eval_sum();
		data1.eval_avg();
		data1.print();
		
		data2.name = "박명수";
		data2.kor = 100;
		data2.eng = 80;
		data2.math = 76;
		
		data2.eval_sum();
		data2.eval_avg();
		data2.print();
		
		
	}
}
