package Recursion;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/7127ypt2kjkf/
// Start
public class Travelling {
    public static int GCD(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        return a%b == 0 ? b: GCD(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = Math.abs(a-arr[0]);

        for (int i = 0; i < n; i++) {
            int d = Math.abs(a-arr[i]);
            res = GCD(res, d);
        }
        System.out.println(res);
    }
}
// End
