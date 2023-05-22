package Practice_Exercise_03;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<10; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("The Average of the Elements of the Array: "+array_avg(arr));
    }
    public static double array_avg(int[] arr){
        double n = arr.length;
        int sum = 0;

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+", ");
            sum = sum+arr[i];
        }
        System.out.println(sum);

        return (sum/n) ;
    }
}
