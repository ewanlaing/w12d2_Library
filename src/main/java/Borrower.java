import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int checkCollectionSize() {
        return collection.size();
    }

    public void checkOutBook(Book book, Library library) {
        if(library.hasBook(book)){
            library.removeBook(book);
            this.collection.add(book);
        }
    }
}
