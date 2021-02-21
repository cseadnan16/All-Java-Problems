package bookApp;

public class Book {
	private String bookName;
	private String author;
	private double price;
	private int stock;
	
	public Book(String bookName, String author, double price, int stock){
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	public String getBookName(){
		return bookName;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getStock(){
		return stock;
	}
}
