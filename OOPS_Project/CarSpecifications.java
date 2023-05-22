package OOPS_Project;

public class CarSpecifications {
    Engine myEng;
    Tyre myTyre;
    public CarSpecifications(String eng, String tyr){
        myEng = EngineAdapter.getEngine(eng);
        myTyre = TyreAdapter.getTyre(tyr);
    }
    public void startCar(){
        myEng.startEngine();
        myEng.intakeAir();
        myEng.intakeFuel();
        myEng.startCompression();
        myEng.ignite();
        myEng.startExhaust();
    }
    public void checkTyre(){
        myTyre.checking();
        myTyre.startRolling();
        myTyre.fillAir();
        myTyre.checkPressure();
        myTyre.stopRolling();
    }

}
