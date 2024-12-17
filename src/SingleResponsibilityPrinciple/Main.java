package SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        //Task 1
        Book sampleBook = new Book("Dune Messiah", "Frank Herbert");
        BookDatabaseService bookDB = new BookDatabaseService();
        bookDB.saveToDatabase(sampleBook);

        //Task 2
        Invoice sampleInvoice = new Invoice(122.29, "SampleCustomer");
        InvoiceDatabaseService invoiceDB = new InvoiceDatabaseService();
        invoiceDB.saveInvoice(sampleInvoice);
        InvoicePrintService invoicePrinter = new InvoicePrintService();
        invoicePrinter.printInvoice(sampleInvoice);
    }
}