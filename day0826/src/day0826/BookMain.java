package day0826;

class Book{
	private String title;
	private String author;
	private int price;
	private static double fee = 0.05 ;
	
	public Book(String title, String author, int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void printInfo() {
		System.out.println("책 제목 :"+title);
		System.out.println("저자 :"+author);
		System.out.println("가격 :"+price);
	}
	
	public void applyDiscount(double discountRate) {
		if(discountRate>0 && discountRate<1) {
			price -= price * discountRate;
		}
	}

	public void applyDiscount(int discountAmount) {
		if(discountAmount>0 && discountAmount<price) {
			price -= discountAmount;
		}
	}
	
	public int getFinalPrice() {
		return (int)(price + (price*fee));
	}
	
}

class EBook extends Book{
	private double fileSize;
	private String fileFormat;
	public EBook(String title, String author, int price,double fileSize,String fileFormat) {
		super(title,author,price);
		this.fileSize=fileSize;
		this.fileFormat=fileFormat;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("파일크기 : "+fileSize+"MB");
		System.out.println("파일형식 : "+fileFormat);
	}
	
}

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("혼자 공부하는 자바", "신용권", 28000);
		book1.printInfo();
		book1.applyDiscount(0.1);
		System.out.println("총 결제금액 (10% 할인) :"+book1.getFinalPrice()+"원");
		System.out.println();
		EBook book2 = new EBook("SQL첫걸음", "아사이 아츠시", 22000, 1.5,"PDF");
		book2.printInfo();
		book2.applyDiscount(5000);
		System.out.println("총 결제금액 (5000원 할인) :"+book2.getFinalPrice()+"원");
	}
}
