//package day0919;
//
//import java.util.ArrayList;
//
//class Score{
//	private String name;
//	private int toeicScore;
//	
//	public void Score(String name, int toeicScore){
//		this.name=name;
//		this.toeicScore=toeicScore;
//	}
//	
//	public void setToeicScore(int toeicScore) {
//		this.toeicScore=toeicScore;
//	}
//	
//	@Override
//	public String toString() {
//		return "name : "+name+" / toeicScore :"+toeicScore;
//	}
//	
//	public char getGrade() {
//		if(toeicScore>=900) {
//			return 'A';
//		}else if(toeicScore>=750) {
//			return 'B';
//		}else if(toeicScore>=600) {
//			return 'C';
//		}else if(toeicScore>=450) {
//			return 'D';
//		}else {
//			return 'F';
//		}
//	}
//}
//
//class ScoreList{
//	private ArrayList scores;
//	
//	public ScoreList() {
//		scores = new ArrayList();
//	}
//	//점수 저장
//	public void addScore(Score score) {
//		scores.add(score);
//	}
//	//점수 가져오기
//	public Score getScore(String name) {
//		for(Score s : scores) {
//			if(s.getName().equals(name)) {
//				return s;
//			}
//		}
//		return null;
//	}
//	
//	public double getAverage() {
//		int total =0;
//		for(score s : scores) {
//			total+=s.getToeicScore();
//		}
//		return(double)total / scores.size();
//	}
//	
//	public Score getMaxScore() {
//		Score max = null;
//		
//		for(Score s : scores) {
//			if(max == null || s.getToeicScore()>max.getToeicScore()) {
//				max = s;
//			}
//		}
//		return max;
//	}
//	
//	public ArrayList<Score> getScores(){
//		return scores;
//	}
//	
//}
//
//public class ToeicMain {
//	ScoreList scoreList = new ScoreList();
//	
//	Score s1 = new Score("김그린",988);
//	scoreList.addScore(s1);
//	
//	scoreList.addScore(new Score("김그린",955));
//	scoreList.addScore(new Score("이체이",111));
//	
//	for(Score s : scoreList.getScores()) {
//		System.out.println(s+"( 등급 : "+s.getGrade()+" )");
//	}
//	
//	
//}
