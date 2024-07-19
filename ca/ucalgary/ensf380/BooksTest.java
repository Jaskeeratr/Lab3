package ca.ucalgary.ensf380;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BooksTest {
    String isbn = "0987654321";
    int pages = 10;

    public BooksTest() {}

    @Test
    public void checkRelationship_AnthologyCoverArt() {
        Anthology anthology = new Anthology();
        String expected = "Method coverArt called from Anthology";
        assertEquals(expected, anthology.coverArt(), "Expected statement was not returned from coverArt() in the Anthology class.");
    }

    @Test
    public void testAnthology_DefaultConstructor() {
        Anthology newAnthology = new Anthology();
        assertNotNull(newAnthology, "Default constructor failed, new Anthology object is null.");
    }

    @Test
    public void testAnthology_InheritedConstructor() {
        Anthology newAnthology = new Anthology(isbn, pages);
        assertNotNull(newAnthology, "Inherited constructor failed, new Anthology object is null.");
    }

    @Test
    public void testPaperbackCoverArt() {
        Nonfiction newNF = new Nonfiction();
        String expected = "Method coverArt called from Paperback";
        assertEquals(expected, newNF.coverArt(), "Expected statement was not returned from coverArt() in the Paperback class.");
    }

    @Test
    public void checkRelationship_NovelCoverArt() {
        Novel novel = new Novel();
        String expected = "Method coverArt called from Novel";
        assertEquals(expected, novel.coverArt(), "Expected statement was not returned from coverArt() in the Novel class.");
    }

    @Test
    public void testFictionGenre() {
        Anthology antho = new Anthology();
        String expected = "Method genre called from Fiction";
        assertEquals(expected, antho.genre(), "Expected statement was not returned from genre() in the Fiction class.");
    }

    @Test
    public void checkRelationship_NonfictionTopic() {
        Nonfiction nonfiction = new Nonfiction();
        String expected = "Method topic called from Nonfiction";
        assertEquals(expected, nonfiction.topic(), "Expected statement was not returned from topic() in the Nonfiction class.");
    }
}

