package bookApp;

public class TestApp {

	public static void main(String[] args) {
		Author author = new Author("Adnan", "adnanan.cse2016@gmail.com", "Male");
		Book book = new Book("Computer Programming", "author", 250, 1000);
		
		System.out.println("Name of the Book: "+ book.getBookName()); 
		System.out.println("Name of the Author: "+ author.getName());
		System.out.println("Price of the book: "+ book.getPrice()+ " tk.");
		System.out.println("Available in stock: "+ book.getStock());
	}

}
