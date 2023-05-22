package NumberGenerator_usingThreads;

public class MyThread {
    public void printThread(){
        System.out.println("The Main Thread ID is: "+Thread.currentThread().getId());
        Runnable r = new NumberGenerator(1,10);
        Thread t1 = new Thread(r);
        t1.start();

        Thread t2 = new Thread(r);
        t2.start();
    }
}
class NumberGenerator implements Runnable{

    int startNumber;
    int endNumber;

    public NumberGenerator(int s, int e) {
        this.endNumber = e;
        this.startNumber = s;
    }
    public void run(){
        System.out.println("This is Thread ID: "+ Thread.currentThread().getId());
        for(int i=startNumber; i<=endNumber; i++){
            System.out.println(i);
        }
    }

}
