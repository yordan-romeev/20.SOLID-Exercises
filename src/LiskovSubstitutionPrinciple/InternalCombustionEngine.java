package LiskovSubstitutionPrinciple;

public class InternalCombustionEngine implements Engine{
    @Override
    public void operate() {
        System.out.println("Internal Combustion Engine operating.");
    }

    public void start(){
        System.out.println("Internal Combustion Engine started.");
    }

}
