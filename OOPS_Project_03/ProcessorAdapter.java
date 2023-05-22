package OOPS_Project_03;

public class ProcessorAdapter {
    public static Processor myproc(int a){
        Processor p;
        if(a == 1){
            p = new ProcessorINTEL();
        }
        else{
            p = new ProcessorAMD();
        }
        return p;
    }
}
