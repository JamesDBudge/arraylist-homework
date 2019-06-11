import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Dune", "Frank Herbert", "Science Fiction");
    }

    @Test
    public void bookHasATitle() {
        assertEquals("Dune", book.getTitle());
    }

    @Test
    public void bookHasAnAuthor() {
        assertEquals("Frank Herbert", book.getAuthor());
    }

    @Test
    public void bookHasAGenre() {
        assertEquals("Science Fiction", book.getGenre());
    }

}
