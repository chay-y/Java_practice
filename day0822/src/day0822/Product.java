package day0822;

public class Product {
	int serialNo; //인스턴스 고유의 일련번호
	static int num;
	
	
	//인스턴스 초기화 블럭 : 모든 생성자에서 공통적으로 수행될 코드
	//긍까..초기화블럭 안의 내용을 동일하게 적용시켜줌~~~
	{
		num++;
		serialNo = num;
	}
	
	Product(){
		
	}
	
	Product (int a){
		
	}
	
}
