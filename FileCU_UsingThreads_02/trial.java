package FileCU_UsingThreads_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;

public class trial {
    public void useThreads(int n){
        Thread[] threads = new Thread[n];
        File newFile = new File("WRITTEN_FILES");
        newFile.mkdir();
        int totalLines = 1000000000;
        int factor = totalLines/n;
        for (int i=0; i<n; i++){
            Runnable writer = new File_Writer(((i*factor)+1),((i+1)*factor));
            threads[i] = new Thread(writer);
            threads[i].start();
        }

    }
}
class File_Writer implements Runnable{
    private int start;
    private int end;
    private long nanos;
    public File_Writer(int s, int e){
        start = s;
        end = e;
    }
    public void run(){
        long id = Thread.currentThread().getId();
        try {
            FileWriter fw = new FileWriter("WRITTEN_FILES\\File_Thread_" + id + ".txt");
            System.out.println("Thread ID: " + id + " File created: File_Thread_" + id + ".txt");
            System.out.println("Thread ID: " + id + ", Successfully Writing to : File_Thread_" + id + ".txt");
            for (int lines=start; lines<=end; lines++) {
                try {
                    fw.write(lines + ": Thread ID-" + id+"\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            fw.close();
        }
        catch (IOException | RuntimeException e){
            throw new RuntimeException(e);
        }
        nanos = ManagementFactory.getThreadMXBean().getThreadCpuTime(id);
        System.out.println("Execution Time of Thread ID-"+id+" : "+nanos/1000000000+" Seconds");
    }

}

