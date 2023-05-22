package OOPS_Project_03;

import java.util.Scanner;

public class CHooseProc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose proces: ");
        int a = sc.nextInt();
        Processor new1 = ProcessorAdapter.myproc(a);
        new1.processData();
        new1.deleteData();
    }
}
