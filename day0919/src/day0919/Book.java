package day0919;

public class Book{
	private String title;
	private String author;
	private int price;
	
	public Book(String title,String author,int price) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book)) {
			return false;
		}
		Book b = (Book) obj;
		return this.title.equals(b.title) && this.author.equals(b.author);
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
