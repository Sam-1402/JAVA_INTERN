package OOPS_Project;

public class EngineMARUTI extends Engine{
    @Override
    public void intakeAir() {
        System.out.println("Maruti Engine: In-taking Air");
    }

    @Override
    public void intakeFuel() {
        System.out.println("Maruti Engine: In-taking Fuel");
    }

    @Override
    public void startCompression() {
        System.out.println("Maruti Engine: Starting Compression");
    }

    @Override
    public void ignite() {
        System.out.println("Maruti Engine: Igniting the Spark Plug");
    }

    @Override
    public void startExhaust() {
        System.out.println("Maruti Engine: Starting Exhaust");
    }
}
