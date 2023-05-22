package OOPS_Project_02;

public class DisplayAdapter {
    public static Display getDisplay(String make){
        Display disp;
        if(make.equals("Sony")){
            disp = new DisplaySONY();
        }
        else{
            disp = new DisplaySAMSUNG();
        }
        return disp;
    }
}
