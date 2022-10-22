package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/d4lnufdonas5/
// Start
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 10 && b >= 10) System.out.println("true");
        else System.out.println("false");

        if ((a&1) == 0 || (b&1) == 0) System.out.println("true");
        else System.out.println("false");

        if (a != b) System.out.println("true");
        else System.out.println("false");
    }
}

// End
