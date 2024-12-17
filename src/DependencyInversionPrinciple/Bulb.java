package DependencyInversionPrinciple;

public class Bulb implements SwitchableDevice{
    @Override
    public void turnOn() {
        System.out.println("Bulb is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb is OFF.");
    }
}
