package Exercise_1;

public class car {
    private String car_model;
    private String car_type;
    Engine engine1;
    Clutch clutch1;
    Gear_transmission gear_transmission1;
    Wheels wheels1;
    Chassis chassis1;

    public car(String m, String type, String fuel, int c, int noc, int nos, String cltype, String trType, String Wm, int r, int tW, String cm, String ct, String model, String carType){
        engine1 = new Engine( m, type, fuel, c, noc, nos);
        clutch1 = new Clutch(cltype);
        gear_transmission1 =new Gear_transmission(trType);
        wheels1 = new Wheels(Wm, r, tW);
        chassis1 = new Chassis(cm, ct);
        this.car_type = carType;
        this.car_model = model;
    }

    public void accelerate(){

    }
    public void brake(){

    }
    public void move_forward(){

    }
    public void move_backwards(){

    }
}
