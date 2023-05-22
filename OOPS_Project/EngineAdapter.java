package OOPS_Project;

public class EngineAdapter {

    public static Engine getEngine(String make){
        Engine eng;
        if(make.equals("Maruti")){
            eng = new EngineMARUTI();
        }
        else{
            eng = new EngineFERRARI();
        }
        return eng;
    }
}
