package OOPS_Project;

public class EngineFERRARI extends Engine{
    @Override
    public void intakeAir() {
        System.out.println("Ferrari Engine: In-taking Air");
    }

    @Override
    public void intakeFuel() {
        System.out.println("Ferrari Engine: In-taking Fuel");
    }

    @Override
    public void startCompression() {
        System.out.println("Ferrari Engine: Starting Compression");
    }

    @Override
    public void ignite() {
        System.out.println("Ferrari Engine: Igniting the Spark Plug");
    }

    @Override
    public void startExhaust() {
        System.out.println("Ferrari Engine: Starting Exhaust");
    }
}
