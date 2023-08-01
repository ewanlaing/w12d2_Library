import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book1 = new Book("Goosebumps", "R.L.Stine", "Horror");
        book2 = new Book ("The Shining", "Stephen King", "Horror");
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.checkCollectionSize());
    }

    @Test
    public void canCheckOutBook(){
        library.addBook(book1);
        library.addBook(book2);
        borrower.checkOutBook(book1, library);
        assertEquals(1, borrower.checkCollectionSize());
    }

    @Test
    public void cannotCheckOutBook(){
        borrower.checkOutBook(book2, library);
        assertEquals(0, borrower.checkCollectionSize());
    }
}
