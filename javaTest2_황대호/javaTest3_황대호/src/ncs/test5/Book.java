package ncs.test5;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	private double discountRate;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String title, String author, String publisher, int price,  double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public int getPrice() {
		return price;
	}


	public String getPublisher() {
		return publisher;
	}


	public double getDiscountRate() {
		return discountRate;
	}
	
	
	
}
