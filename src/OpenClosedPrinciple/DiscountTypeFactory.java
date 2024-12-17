package OpenClosedPrinciple;

import java.util.HashMap;
import java.util.Map;

public class DiscountTypeFactory {
    private final Map<String, DiscountType> discountTypes;

    public DiscountTypeFactory() {
        this.discountTypes = Map.ofEntries(
                Map.entry("STUDENT", new StudentDiscount()),
                Map.entry("SENIOR", new SeniorDiscount())
        );
    }

    public DiscountType getDiscountType(String discountType){
        return this.discountTypes.get(discountType);
    }
}
