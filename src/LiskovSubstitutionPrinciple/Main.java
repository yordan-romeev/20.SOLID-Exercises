package LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Engine iceEngine = new InternalCombustionEngine();
        iceEngine.operate();
        Engine elEngine = new ElectricEngine();
        elEngine.operate();
    }
}
