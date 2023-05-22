package OOPS_Project;

public class TyreCEAT extends Tyre{
    @Override
    public void startRolling() {
        System.out.println("Ceat Tyres: Started Rolling");
    }

    @Override
    public void stopRolling() {
        System.out.println("Ceat Tyres: Stopped Rolling");
    }

    @Override
    public void fillAir() {
        System.out.println("Ceat Tyres: Filling Air");
    }

    @Override
    public void checkPressure() {
        System.out.println("Ceat Tyres: Checking Pressure");
    }
}
