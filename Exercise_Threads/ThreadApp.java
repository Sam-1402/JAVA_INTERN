package Exercise_Threads;

public class ThreadApp {
    public static void main(String[] args) {
        Thread t1 = new Thread(new IncrementTest());
        t1.start();

        Thread t2 = new Thread(new IncrementTest());
        t2.start();

        System.out.println("Hello World");
    }
}
class IncrementTest implements Runnable{
    static int k = 0;
    public void run(){
        for (int i=0; i<10; i++){
            k++;
            System.out.println(Thread.currentThread().getId()+" "+k);
        }
    }
}
