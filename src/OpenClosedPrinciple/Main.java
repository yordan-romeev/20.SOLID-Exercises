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




    }
}
