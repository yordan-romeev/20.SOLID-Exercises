package OpenClosedPrinciple;

public class DiscountCalculator {
    private final DiscountTypeFactory discountTypes;

    public DiscountCalculator(DiscountTypeFactory discountTypes) {
        this.discountTypes = discountTypes;
    }

    public double calculateDiscount(String type, double price) {
        DiscountType discountType = this.discountTypes.getDiscountType(type);
        return discountType.calculateDiscount(price);
    }
}
