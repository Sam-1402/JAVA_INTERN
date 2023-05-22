package Practice_Exercise_03;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args){
//    12. write a java program to compare two array. There are two types of equalities, write code for both equalities.

        int[] a = new int[10];
        int[] b = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of Array A: ");
        for(int i=0; i<10; i++){
            a[i] = s.nextInt();
        }
        System.out.println("Enter the elements of Array B: ");
        for(int i=0; i<10; i++){
            b[i] = s.nextInt();
        }
//              1. Numbers in array are same (irrespective of position).
                    int check =0;
                    for(int i=0; i<10; i++){
                        if(!search(b, a[i])){
                            System.out.println("1. Arrays are 'NOT SAME' (irrespective of Position)");
                            check = 1;
                            break;
                        }
                    }
                    if(check == 0){
                        System.out.println("1. Arrays are 'SAME' (irrespective of Position)");
                    }

//              2. Both numbers in array and positions have to be same to be equal.
                    check = 0;
                    for(int i=0; i<10; i++){
                        if(a[i]!=b[i]){
                            System.out.println("2. Arrays are NOT EQUAL (either due to element or its position)");
                            check = 1;
                            break;
                        }
                    }
                    if(check == 0){
                        System.out.println("2. Arrays are EQUAL (both have same elements at same position)");
                    }
    }
    public static boolean search(int[]a, int key){
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                return true;
            }
        }
        return false;
    }

}

