package FileCU_UsingThreads_02;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("No_Of_Threads (2,4,8,16,32): ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        trial obj = new trial();
        obj.useThreads(n);
    }
}
