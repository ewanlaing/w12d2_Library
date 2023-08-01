import java.util.ArrayList;

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
}
