public class Book {
    private static String libraryName = "Ayu's Library";
    private final String isbn;
    private String title;
    private String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("123-456-789", "The Fine Print", "Lauren Asher");
        Book book2 = new Book("987-654-321", "Terms and Conditions", "Lauren Asher");

        displayLibraryName();
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}
