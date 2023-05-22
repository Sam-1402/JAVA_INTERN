package FileCU_usingThreads;

public class MyFile {
    public static void main(String[] args) {
        System.out.println("=========THE FILE CREATOR AND WRITER============");
        File_Parallelism fp = new File_Parallelism();
//        long a = System.currentTimeMillis()/1000;
        fp.startCreation();
//        long b = System.currentTimeMillis()/1000;
//        System.out.println("Execution Time: "+ (b-a));
    }
}
