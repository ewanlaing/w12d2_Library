import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private Integer capacity;
    public Library (int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int numberOfBooks() {
        return this.books.size();
    }

    public boolean capacityReached(){
        return numberOfBooks() == this.capacity;
    }

    public void addBook(Book book) {
        if (!capacityReached()) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public boolean hasBook(Book book) {
        return this.books.contains(book);
    }

    public int numberByGenre(String genre) {
        HashMap<String, Integer> genreNumbers = new HashMap<>();
        genreNumbers.put("Horror", 0);
        genreNumbers.put("Fantasy", 0);
        genreNumbers.put("Science Fiction", 0);
        for (Book book : this.books){
            int initial = genreNumbers.get(book.getGenre());
            genreNumbers.replace(book.getGenre(), (initial + 1));
        }
        return genreNumbers.get(genre);
    }
}
