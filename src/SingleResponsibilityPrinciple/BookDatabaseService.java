package SingleResponsibilityPrinciple;

public class BookDatabaseService {
    public void saveToDatabase(Book book){
        System.out.printf("Saved book: %s%n", book.getBookSummary());
    }
}
