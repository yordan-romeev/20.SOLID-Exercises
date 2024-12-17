package OpenClosedPrinciple;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private FileWriter logFile;

    public FileLogger(FileWriter logFile) {
        this.logFile = logFile;
    }

    @Override
    public void logMessage(String message) {
        try {
            logFile.write(message);
            logFile.write(System.lineSeparator());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
