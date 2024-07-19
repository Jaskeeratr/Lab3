package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private Story[] stories;

    public Anthology() {}

    public Anthology(String isbn, int pages) {
        super(isbn, pages);
    }

    public String coverArt() {
        return "Method coverArt called from Anthology";
    }

    public Story[] getStory() {
        return stories;
    }

    public void setStory(Story[] stories) {
        this.stories = stories;
    }
}
