import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;


    @Before
    public void before() {
        book = new Book("Dune", "Frank Herbert", "Science Fiction");
        library = new Library(1);
    }

    @Test
    public void canCountBooks() {
        assertEquals(0, library.countStock());
    }

    @Test
    public void canAddABookToStock() {
        library.addBook(book);
        assertEquals(1, library.countStock());
    }

    @Test
    public void cannotAddTooManyBooksToTheLibrary() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.countStock());
    }

}
