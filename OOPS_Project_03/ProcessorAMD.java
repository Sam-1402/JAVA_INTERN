package OOPS_Project_03;

public class ProcessorAMD extends Processor{
    @Override
    public void processData() {
        System.out.println("AMD: Processing");
    }

    @Override
    public void deleteData() {
        System.out.println("AMD: Deleting");
    }
}
