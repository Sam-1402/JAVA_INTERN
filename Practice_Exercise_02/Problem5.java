package Practice_Exercise_02;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        //4. Simple Calculator using Switch Case Statements.
        Scanner s = new Scanner(System.in);
        System.out.println("------------SIMPLE CALCULATOR-----------");

        //2. Accept operation to be carried out (a = addition, s = subtraction, m = multiplication, d = division, p = power)
        int e = 0;
        while(e == 0){
            System.out.println("------SELECT OPERATION------");
            System.out.println("a = addition, s = subtraction, m = multiplication, d = division, p = power, e = E^, r = Modulo, t = Trigonometric");

            char op = s.next().charAt(0);

            switch(op){
                case 'a':
                    System.out.print("Enter 1st Number: ");
                    int num1 = s.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    int num2 = s.nextInt();
                    System.out.println(num1+" + "+num2+" = "+ (num1+num2));
                    break;
                case 's':
                    System.out.print("Enter 1st Number: ");
                    int num3 = s.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    int num4 = s.nextInt();
                    System.out.println(num3+" - "+num4+" = "+ (num3-num4));
                    break;
                case 'm':
                    System.out.print("Enter 1st Number: ");
                    int num0 = s.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    int num = s.nextInt();
                    System.out.println(num0+" * "+num+" = "+ (num0*num));
                    break;
                case 'd':
                    System.out.print("Enter 1st Number: ");
                    int num5 = s.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    int num6 = s.nextInt();
                    System.out.println(num5+" / "+num6+" = "+ (num5/num6));
                    break;
                case 'p':
                    System.out.print("Enter Base Number: ");
                    int num7 = s.nextInt();
                    System.out.print("Enter the Power Number: ");
                    double num8 = s.nextDouble();
                    System.out.println(num7+" ^ "+num8+" = "+ Math.pow(num7, num8));
                    break;
                case 'e':
                    System.out.println("Enter the Power Number: ");
                    double num9 = s.nextDouble();
                    System.out.println("E ^ "+num9+" = "+Math.exp(num9));
                    break;
                case 'r':
                    System.out.print("Enter 1st Number: ");
                    int num10 = s.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    int num11 = s.nextInt();
                    System.out.println(num10+" % "+num11+" = "+ (num10%num11));
                    break;
                case 't':
                    System.out.println("----------------Choose the Trigonometric Function----------");
                    System.out.println("s = Sin, c = Cos, t = Tan, co = Cot, cosec = Cosec, se = Sec");
                    String trig = s.next();
                    switch (trig){
                        case "s":
                            System.out.println("Enter the degree: ");
                            double deg = s.nextDouble();
                            double radian = Math.toRadians(deg);
                            System.out.println("Sin("+deg+") = "+Math.sin(radian));
                            break;
                        case "c":
                            System.out.println("Enter the degree: ");
                            double deg1 = s.nextDouble();
                            double radian1 = Math.toRadians(deg1);
                            System.out.println("Cos("+deg1+") = "+Math.cos(radian1));
                            break;
                        case "t":
                            System.out.println("Enter the degree: ");
                            double deg2 = s.nextDouble();
                            double radian2 = Math.toRadians(deg2);
                            System.out.println("Tan("+deg2+") = "+Math.tan(radian2));
                            break;
                        case "co":
                            System.out.println("Enter the degree: ");
                            double deg3 = s.nextDouble();
                            double radian3 = Math.toRadians(deg3);
                            System.out.println("Cot("+deg3+") = "+(1/Math.tan(radian3)));
                            break;
                        case "cosec":
                            System.out.println("Enter the degree: ");
                            double deg4 = s.nextDouble();
                            double radian4 = Math.toRadians(deg4);
                            System.out.println("Cosec("+deg4+") = "+(1/Math.sin(radian4)));
                            break;
                        case "se":
                            System.out.println("Enter the degree: ");
                            double deg5 = s.nextDouble();
                            double radian5 = Math.toRadians(deg5);
                            System.out.println("Sec("+deg5+") = "+(1/Math.cos(radian5)));
                            break;
                    }
            }
            System.out.println("To calculate Again: 0,  To end: 1");
            e = s.nextInt();
        }
        //With switch case statement perform any of these operations.
        //User should give numbers and operations.
    }
}
