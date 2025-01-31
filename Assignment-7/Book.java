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
	
	void display() {
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Price: "+ price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("The Fine Print", "Lauren Asher", 599);
		book.display();
	}

}
