package OpenClosedPrinciple;

public class ConsoleLogger implements Logger{
    @Override
    public void logMessage(String message) {
        System.out.printf("Message logged to console: %s%n", message);
    }
}
