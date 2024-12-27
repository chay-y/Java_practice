package day0823;

class Webtoon{
	private String title;
	private String genre;
	private String author;
	
	private static int count=0;
	
	Webtoon(){}
	
	Webtoon(String title, String genre, String author){
		this.title=title;
		this.genre=genre;
		this.author=author;
		count++;
	}
	
	public void print(){
		System.out.printf("Webtoon {제목 : %s, 장르 : %s, 작가 : %s}\n",title, genre, author);
	}
	
	public static int getCount(){
		return count;
	}
}

public class WebtoonMain {
	
	public static void main(String[] args) {
		
		Webtoon wt1 = new Webtoon("나혼자만 레벨업","판타지","나혼자");
		Webtoon wt2 = new Webtoon("스위트 홈","스릴러","김달콤");
		Webtoon wt3 = new Webtoon("이태원 클라스","드라마","이태원");
		

		//객체배열
		Webtoon[] webtoons = {wt1, wt2, wt3};
		
		for (int i=0; i<webtoons.length; i++) {
			webtoons[i].print();
		}
		
//		wt1.print();
//		wt2.print();
//		wt3.print();
		
		System.out.println("총 웹툰의 수 : "+Webtoon.getCount());
		
	}
}


