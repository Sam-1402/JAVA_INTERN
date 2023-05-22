package Practice_Exercise_03;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){
        //10. Write a java program to store 10 elements in an array and search for the element in array.

        int[] a = new int[10];
        int n=10;
        System.out.println("Enter the Elements of Array: ");
        Scanner s = new Scanner(System.in);
        for(int i=0; i<n; i++){
            a[i] = s.nextInt();
        }
        System.out.println("Enter the Element to find: ");
        int key = s.nextInt();

        int index = -1;
        for(int i=0; i<n; i++){
            if(a[i]==key){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Index of Key: "+index);
        }
        else{
            System.out.println("Key is Not Present in the given Array!!");
        }

    }
}
