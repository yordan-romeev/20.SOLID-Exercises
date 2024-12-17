package LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {

        //Task 1
        Engine iceEngine = new InternalCombustionEngine();
        iceEngine.operate();
        Engine elEngine = new ElectricEngine();
        elEngine.operate();

        //Task 2
        FlyingBird raven = new Raven();
        raven.fly();
        FlightlessBird penguin = new Penguin();
        penguin.walk();
    }
}
