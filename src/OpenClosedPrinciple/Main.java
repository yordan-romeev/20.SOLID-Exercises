package OpenClosedPrinciple;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.logMessage("Sample message to console");

        try (FileWriter logWriter = new FileWriter(".\\src\\OpenClosedPrinciple\\sampleLog.txt", true)) {
            Logger fileLogger = new FileLogger(logWriter);
            fileLogger.logMessage("Sample message to file");
        } catch (Exception e) {
            e.printStackTrace();
        }

        DiscountTypeFactory discountFactory = new DiscountTypeFactory();
        DiscountCalculator discountCalculator = new DiscountCalculator(discountFactory);

        double studentDiscount = discountCalculator.calculateDiscount("STUDENT", 100);
        System.out.printf("Student discount: %.2f%n", studentDiscount);
        double seniorDiscount = discountCalculator.calculateDiscount("SENIOR", 100);
        System.out.printf("Senior discount: %.2f%n", seniorDiscount);


    }
}
