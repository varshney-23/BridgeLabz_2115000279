import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{Title='" + title + "', Author='" + author + "'}";
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book("The Fine Print", "Lauren Asher");
        Book book2 = new Book("Terms And Condition", "Lauren Asher");
        Book book3 = new Book("The Final Offer", "Lauren Asher");

        Library library1 = new Library("Om Library");
        Library library2 = new Library("Varshney Library");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        library1.showBooks();
        library2.showBooks();
    }
}
