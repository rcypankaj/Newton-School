package Arrays;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/grvv4aqj8y3b/
// Start
public class GCD {
    public static void findGCD(int a, int b) {
        if (a%b == 0) {
            System.out.println(b);
            return;
        }
        findGCD(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        findGCD(a,b);
    }
}

// End
