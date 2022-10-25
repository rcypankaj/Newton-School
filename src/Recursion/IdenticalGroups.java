package Recursion;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/3t17mxzbekru/
// Start
public class IdenticalGroups {
    public static int GCD(int a, int b) {
        return a%b == 0 ? b : GCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(GCD(a,b));
    }
}

// End
