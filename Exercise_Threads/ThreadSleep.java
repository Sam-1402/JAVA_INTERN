package Exercise_Threads;

public class ThreadSleep {
    public static void main(String[] args) {

        System.out.println("Main Thread "+Thread.currentThread().getId());
        Thread deiThread = new Thread(new DeiStudent());
        deiThread.start();
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getId()+ " "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class DeiStudent implements Runnable{

    @Override
    public void run() {
        System.out.println("Dei Student Thread" + Thread.currentThread().getId());
        System.out.println("Runnable Thread");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
