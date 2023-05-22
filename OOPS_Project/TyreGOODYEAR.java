package OOPS_Project;

public class TyreGOODYEAR extends Tyre{
    @Override
    public void startRolling() {
        System.out.println("GoodYear Tyres: Started Rolling");
    }

    @Override
    public void stopRolling() {
        System.out.println("GoodYear Tyres: Stopped Rolling");
    }

    @Override
    public void fillAir() {
        System.out.println("GoodYear Tyres: Filling Air");
    }

    @Override
    public void checkPressure() {
        System.out.println("GoodYear Tyres: Checking Pressure");
    }
}
