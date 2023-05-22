package FileCU_usingThreads;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Parallelism {
    public void startCreation(){
        System.out.println("The Main Thread ID is: "+Thread.currentThread().getId());
        Runnable creator = new createFile();
        Runnable writer = new writeFile();
        Thread t1 = new Thread(creator);
        Thread[] t2 = new Thread[4];
        t1.start();
        for (int i=0; i<4; i++){
            t2[i] = new Thread(writer);
            t2[i].start();
        }
    }
}
class createFile implements Runnable{
    int e = 25;
    public void run(){
        System.out.println("This File Creator Thread ID is: "+Thread.currentThread().getId());
        File folder = new File("C:\\Users\\asus\\IdeaProjects\\internship\\src\\New_Folder");
        folder.mkdir();
        for (int i=1; i<=e; i++){
            try {
                File myObj = new File("C:\\Users\\asus\\IdeaProjects\\internship\\src\\New_Folder\\File_"+i+".txt");
                System.out.println("Thread ID: "+Thread.currentThread().getId()+" File created: " + myObj.getName());
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class writeFile implements Runnable{
    int e = 25;
    public void run()
    {
        System.out.println("This File Writer Thread ID is: "+Thread.currentThread().getId());
        try {
            Thread.sleep(6);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        for (int i=1; i<=e; i++){
            try {
                FileWriter fw = new FileWriter("C:\\Users\\asus\\IdeaProjects\\internship\\src\\New_Folder\\File_"+i+".txt");
                fw.write("This is Thread: "+Thread.currentThread().getId()+" Hello World Writing to the file - "+i);
                fw.close();
                System.out.println("Thread ID: "+Thread.currentThread().getId()+" Successfully wrote the file - "+i);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
    }
}
