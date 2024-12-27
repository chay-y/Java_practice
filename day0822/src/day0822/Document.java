package day0822;

public class Document {

	static int count=0;
	String name;
	
	Document(){
		this("제목없음"+ ++count+".java");
	}

	Document(String name){
		this.name=name;
		System.out.println(name+"가 생성됨");
		
	}
	
	public static void main(String[] args) {
		//Document 객체를 생성
		//문서의 제목이 있으면 문서명을 그대로 출력
		//만약 문서명을 지정하지 않았다면 '제목없음1'```을 출력
		
		Document d1 = new Document();
		Document d2 = new Document();
		Document d3 = new Document("자바.txt");
		Document d4 = new Document();
		
		//제목없음1.txt가 생성됨
		//제목없음2.txt가 생성됨
		//자바.txt가 생성됨
		//제목없음3.txt가 생성됨
		
	}
}
