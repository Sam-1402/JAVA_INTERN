package OOPS_Project_02;

import java.util.Scanner;

public class MyTV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Display: (Sony, Samsung)");
        String disp = sc.next();
        System.out.println();
        System.out.println("Choose Sound System: (Bose, Dolby)");
        String ss = sc.next();
        System.out.println();

        TVSpecifications myTv = new TVSpecifications(disp, ss);
        myTv.startTV();
        myTv.switchOffTV();
    }
}
