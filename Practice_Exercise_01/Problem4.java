package Practice_Exercise_01;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        //4. Simple Calculator using Switch Case Statements.
        Scanner s = new Scanner(System.in);
        //1. Take two numbers (Example 10, 2).
        System.out.println("-------SIMPLE CALCULATOR------");
        System.out.print("Enter 1st Number: ");
        int num1 = s.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = s.nextInt();
        System.out.println("------SELECT OPERATION------");
        System.out.println("a = addition, s = subtraction, m = multiplication, d = division");

        //2. Accept operation to be carried out (a = addition, s = subtraction, m = multiplication, d = division)
        char op = s.next().charAt(0);

        switch(op){
            case 'a':
                System.out.println(num1+" + "+num2+" = "+ (num1+num2));
                break;
            case 's':
                System.out.println(num1+" - "+num2+" = "+ (num1-num2));
                break;
            case 'm':
                System.out.println(num1+" * "+num2+" = "+ (num1*num2));
                break;
            case 'd':
                System.out.println(num1+" / "+num2+" = "+ (num1/num2));
                break;
        }
        //With switch case statement perform any of these operations.
        //User should give numbers and operations.
    }
}
