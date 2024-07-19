package ca.ucalgary.ensf380;

public class Novel extends Fiction {
    private String title;

    public Novel() {}

    public Novel(String isbn, int pages) {
        super(isbn, pages);
    }

    public String coverArt() {
        return "Method coverArt called from Novel";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
