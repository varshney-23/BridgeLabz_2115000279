class Movie {
    String title, director;
    int year;
    double rating;
    Movie prev, next;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = this.next = null;
    }
}

class MovieManagement {
    private Movie head, tail;

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
            return;
        }
        tail.next = newMovie;
        newMovie.prev = tail;
        tail = newMovie;
    }

    public void deleteMovieByTitle(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    public void displayMoviesForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieManagement mm = new MovieManagement();
        mm.addMovieAtEnd("Avengers", "Ayushi", 2018, 9.0);
        mm.addMovieAtEnd("Batman", "Pranjal", 2000, 8.5);
        mm.addMovieAtEnd("Inception", "Varshney", 2022, 9.8);
        mm.displayMoviesForward();
        
        mm.deleteMovieByTitle("Batman");
        System.out.println("\nAfter deleting Batman:");
        mm.displayMoviesForward();
    }
}
