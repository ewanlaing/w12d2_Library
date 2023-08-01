import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("Goosebumps", "R.L.Stine", "Horror");
        book2 = new Book ("The Shining", "Stephen King", "Horror");
        book3 = new Book("Dune", "Frank Herbert", "Science Fiction");
        book4 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void canCheckHowManyBooksInLibrary(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void canAddBooksToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void willNotAddBookIfCapacityReached(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.numberOfBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book2);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void canFindBook(){
        library.addBook(book1);
        assertEquals(true, library.hasBook(book1));
    }

    @Test
    public void cannotFindBook(){
        assertEquals(false, library.hasBook(book2));
    }
}
