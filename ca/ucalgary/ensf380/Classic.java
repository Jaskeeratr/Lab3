package ca.ucalgary.ensf380;

public class Classic extends Fiction {
    private int origPubYear = 1860;
    private Author theAuthor;
    private Publisher[] bookPublisher;

    public String createNotes() {
        return "Method createNotes called from Classic";
    }

    public int getOrigPubYear() {
        return origPubYear;
    }

    public void setOrigPubYear(int year) {
        this.origPubYear = year;
    }

    public Author getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author author) {
        this.theAuthor = author;
    }

    public Publisher[] getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(Publisher[] pub) {
        this.bookPublisher = pub;
    }
}
