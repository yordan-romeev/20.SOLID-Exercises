package DependencyInversionPrinciple;

public class WeatherReporter {
    private TempSensor sensor;

    public String report() {
        return "Current temperature: " + sensor.getTemperature();
    }
}
