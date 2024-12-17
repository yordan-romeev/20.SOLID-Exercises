package SingleResponsibilityPrinciple;

public class InvoicePrintService {
    public void printInvoice(Invoice invoice) {
        // Print invoice
        System.out.printf("Invoice printed: %s%n", invoice.getInvoiceDetails());
    }
}
