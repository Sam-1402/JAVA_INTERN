package NumberGenerator_usingThreads;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the Parallelism Example");
        MyThread m = new MyThread();
//        long a = System.currentTimeMillis()/1000;
        m.printThread();
//        long b = System.currentTimeMillis()/1000;
//        System.out.println("Execution Time: "+(b-a));
    }
}
