package DependencyInversionPrinciple;

public class TemperatureSensor implements TempSensor {
    @Override
    public double getTemperature() {
        // Return temperature from sensor
        return 25.0; // dummy value
    }
}
