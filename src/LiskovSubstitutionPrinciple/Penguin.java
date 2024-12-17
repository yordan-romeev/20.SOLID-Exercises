package LiskovSubstitutionPrinciple;

public class Penguin implements FlightlessBird{
    @Override
    public void walk() {
        System.out.println("Penguin walking");
    }
}
