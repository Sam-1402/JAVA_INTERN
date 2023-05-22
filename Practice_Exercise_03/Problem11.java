package Practice_Exercise_03;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args){
//        11. Take a name of person and reverse the string. Find out if it is a palindrome.
        Scanner s = new Scanner(System.in);
        String name = s.next();

        int len = name.length()-1;
        String newName = "";
        for(int i=len; i>=0; i--){
            newName = newName + name.charAt(i);
        }
        System.out.println(newName);
        if(newName.equals(name)){
            System.out.println("It is a Palindrome!!");
        }
        else{
            System.out.println("No, its not a Palindrome");
        }
    }
}
