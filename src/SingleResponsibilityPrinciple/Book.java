package SingleResponsibilityPrinciple;

public class Book {
    private String title;
    private String author;
    // ... other properties

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getBookSummary() {
        return title + " by " + author;
    }
}