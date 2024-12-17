package LiskovSubstitutionPrinciple;

public class ElectricEngine implements Engine {
    @Override
    public void operate() {
        System.out.println("Electric Engine operating.");
    }
}
