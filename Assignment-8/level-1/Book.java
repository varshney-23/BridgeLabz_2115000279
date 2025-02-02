public class Book {
	String title;
	String author;
	double price;
	
	public Book(String title, String author, double price) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book() {
		// TODO Auto-generated constructor stub
		this.title = "Terms And Conditions";
		this.author = "Asher Lauren";
		this.price = 456;
	}
	void display() {
		System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
	}
	public static void main (String [] args) {
		Book defaultBook = new Book();
		Book cusBook = new Book("The Fine Print", "Asher Lauren", 679.8);
		
		defaultBook.display();
		cusBook.display();
	}
}









