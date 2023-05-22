package Exercise_1;

public class Engine {
    private int no_of_strokes;
    private String manufacturer;
    private int cc;
    private String Engine_type;
    private int no_of_cylinder;
    private String fuel_type;

    public Engine( String m, String type, String fuel, int c, int noc, int nos){
        this.manufacturer = m;
        this.cc = c;
        this.Engine_type = type;
        this.fuel_type = fuel;
        this.no_of_cylinder = noc;
        this.no_of_strokes = nos;
    }

    public void open_valve(){

    }
    public void close_valve(){

    }
    public void move_piston_down(){

    }
    public void move_piston_up(){

    }
    public void inject_fuel(){

    }
    public void turnOn_sparkPlug(){

    }
}
