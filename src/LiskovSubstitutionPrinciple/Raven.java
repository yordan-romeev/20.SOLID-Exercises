package LiskovSubstitutionPrinciple;

public class Raven implements FlyingBird{
    @Override
    public void fly() {
        System.out.println("Raven flying.");
    }
}
