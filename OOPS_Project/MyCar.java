package OOPS_Project;

import java.util.Scanner;

public class MyCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Engine:- (Maruti , Ferrari) ");
        String n = sc.next();
        System.out.println();
        System.out.println("Choose the Tyres:- (GoodYear , Ceat) ");
        String t = sc.next();
        System.out.println();
        //Engine myeb = new EngineMARUTI();

        CarSpecifications myCar = new CarSpecifications(n, t);
        myCar.startCar();
        myCar.checkTyre();
    }
}
