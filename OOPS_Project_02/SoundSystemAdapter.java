package OOPS_Project_02;

public class SoundSystemAdapter {
    public static SoundSystem getSoundSystem(String make){
        SoundSystem ss;
        if(make.equals("Bose")){
            ss = new SoundSystemBOSE();
        }
        else{
            ss = new SoundSystemDOLBY();
        }
        return ss;
    }
}
