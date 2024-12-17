package SingleResponsibilityPrinciple;

public class Invoice {
    private double amount;
    private String customerName;
    // ... other properties


    public Invoice(double amount, String customerName) {
        this.amount = amount;
        this.customerName = customerName;
    }

    public String getInvoiceDetails(){
        return String.format("Invoice: Customer - %s; Amount - %.2f%n", this.customerName, this.amount);
    }
}