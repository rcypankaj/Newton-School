package Recursion;
import java.util.Scanner;

// Question URL: https://my.newtonschool.co/playground/code/d9h0gi0lkju8/
// Start
public class SuccessiveGCD {
    public static int GCD(int a, int b) {// 1000000000
        if (a == 0) return b;
        if (b == 0) return a;
        return a%b == 0 ? b : GCD(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = arr[0];
        for (int j : arr) res = GCD(res, j);
        System.out.println(res);

    }
}

// End