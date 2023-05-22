package Practice_Exercise_02;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = s.nextInt();

        //7a.
        System.out.println("7a. ");
        for(int i=0; i<n; i++){
            System.out.print("* ");
        }
        System.out.println();

        //7b.
        System.out.println("7b. ");
        for(int row=0; row<n; row++){
            for(int col=0; col<n; col++){
                if(col==0 || col==n-1 || row==0 || row==n-1 ){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        //7c.
        System.out.println("7c. ");
        for(int row=0; row<n; row++){
            for (int col=0; col<n; col++){
                if(col==0 || col==row || row==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //7d.
        System.out.println("7d. ");
        for(int row=0; row<n; row++){
            for (int col=0; col<n-row; col++){
                if(col==(n-row)-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int col=0; col<2*row; col++){
                if(col==(2*row)-1 || row == n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //7e.
        System.out.println("7e. ");
        for(int row=0; row<n/2; row++){
            for(int col=0; col<n; col++){
                if(col==0 || col==n-1 || row==0 || row==(n/2)-1 ){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
