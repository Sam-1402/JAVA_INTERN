package Practice_Exercise_02;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Using Recursion");
        System.out.println("Factorial of "+num+" is : "+factorial(num));
        System.out.println("Using Loops");
        long facto = 1;

        for(int i = num; i>=1; i--){
            facto = i * facto;
        }
        System.out.println("Factorial of "+num+" is : "+facto);

    }

    public static long factorial(int num){
        if(num == 0){
            return 1;
        }
        long fact = num * factorial(num-1);
        return fact;
    }
}
