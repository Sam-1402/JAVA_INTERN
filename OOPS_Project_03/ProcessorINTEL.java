package OOPS_Project_03;

public class ProcessorINTEL extends Processor{
    @Override
    public void processData() {
        System.out.println("Intel: Processing");
    }

    @Override
    public void deleteData() {
        System.out.println("Intel: Deleting");
    }
}
