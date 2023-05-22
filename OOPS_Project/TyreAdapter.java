package OOPS_Project;

public class TyreAdapter {
    public static Tyre getTyre(String make){
        Tyre ty;
        if(make.equals("Ceat")){
            ty = new TyreCEAT();
        }
        else{
            ty = new TyreGOODYEAR();
        }
        return ty;
    }

}
