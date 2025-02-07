class Book{
    String title;
    int publicationYear;
	public Book(String title,int publicationYear){
	    this.title=title;
		this.publicationYear=publicationYear;
	}
	public void displayInfo(){
	    System.out.println("Title --> "+title);
		System.out.println("Publication Year --> "+publicationYear);
	}
}
class Author extends Book{
    String name;
	String bio;
	public Author(String title,int publicationYear,String name,
      String bio){
	    super(title,publicationYear);
		this.name=name;
		this.bio=bio;
	}
	@Override
	public void displayInfo(){
	    super.displayInfo();
		System.out.println("Author Name --> "+name);
		System.out.println("Author Bio --> "+bio);
	}
}
public class LibraryManagement{
    public static void main(String[] args){
    	Author book1 = new Author("The Fine Print", 1979, "Lauren Asher", "A British author and humorist.");
    	Author book2 = new Author("Terms and Conditions", 2022, "Lauren Asher", "A British author and humorist.");
    	Author book3 = new Author("Final Offer", 2023, "Lauren Asher", "A British author and humorist.");
		book1.displayInfo();
		System.out.println();
		book2.displayInfo();
		System.out.println();
		book3.displayInfo();
	}
}