package OpenClosedPrinciple;

public class StudentDiscount implements DiscountType{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.1;
    }
}