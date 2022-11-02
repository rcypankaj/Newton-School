package Sorting;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/51hvz35lvmme/
// Start
public class EfficientPowerFunction {
    public static long power(int a, int n) {
        if (n == 0) return 1;

        // when n is even
        if (n%2 == 0)
            return (power(a,n/2) * power(a, n/2)) % 1000000007;

        // when n is odd
        else return a*power(a,n-1)%1000000007;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(a,n));
    }
}

// End