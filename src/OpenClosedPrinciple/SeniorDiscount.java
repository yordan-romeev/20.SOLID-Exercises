package OpenClosedPrinciple;

public class SeniorDiscount implements DiscountType{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.2;
    }
}
