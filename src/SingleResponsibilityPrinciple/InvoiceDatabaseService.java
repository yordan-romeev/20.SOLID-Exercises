package SingleResponsibilityPrinciple;

public class InvoiceDatabaseService {
    public void saveInvoice(Invoice invoice) {
        // Save invoice to database
        System.out.printf("Invoice saved: %s%n", invoice.getInvoiceDetails());
    }
}
