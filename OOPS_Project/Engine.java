package OOPS_Project;

public abstract class Engine implements IEngine{
    public int no_of_strokes;
    public int no_of_cylinders;
    public int cc;
    public String engineLayout;
    public String fuelType;
    public final void startEngine(){
        System.out.println("Starting Engine!!  (This is same for all child class)");
    }
    public abstract void intakeAir();
    public abstract void intakeFuel();
    public abstract void startCompression();
    public abstract void ignite();
    public abstract void startExhaust();
}
