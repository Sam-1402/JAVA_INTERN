package Practice_Exercise_01;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        //2. Accept 5 variables from command prompt as parameter from Java program
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        float d = s.nextFloat();
        float e = s.nextFloat();


        //2a. Print result of ++a;
        System.out.println(++a);

        //2b. Print result of a++
        System.out.println(a++);

        //2c. print result of (a++ + b++ ) / c++
        System.out.println((a++ + b++)/c++);

        //2d. print result of a/(b*(c + ++d));
        System.out.println(a/(b*(c + ++d)));

        //2e. Print result of a^b++ + b ^ ++c + c ^ --d + d ^ e--
        System.out.println((int)a^(int)b++ + (int)b ^ (int)++c + (int)c ^ (int)--d + (int)d ^ (int)c--);
        System.out.println(Math.pow(a,b++) + Math.pow(b, ++c) + Math.pow(c , --d) + Math.pow(d , e--));

    }
}
