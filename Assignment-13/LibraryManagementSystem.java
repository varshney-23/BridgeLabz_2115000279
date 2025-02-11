class Book {
    String title, author, genre;
    int bookId;
    boolean isAvailable;
    Book prev, next;

    public Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = this.next = null;
    }
}

class Library {
    private Book head, tail;

    public void addBook(int bookId, String title, String author, String genre, boolean isAvailable) {
        Book newBook = new Book(bookId, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public void displayBooks() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + ", Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(101, "Java Programming", "Ayushi", "Tech", true);
        lib.addBook(102, "Data Structures", "Pranjal", "CS", false);
        lib.displayBooks();
    }
}
