package OOPS_Project;

public abstract class Tyre implements ITyre{
    public int tyreRadius;
    public int tyreWidth;
    public String grooves;
    public float traction;

    public final void checking(){
        System.out.println("Starting to check Tyres!! (This fixed for all child class)");
    }

    public abstract void startRolling();
    public abstract void stopRolling();
    public abstract void fillAir();
    public abstract void checkPressure();
}
