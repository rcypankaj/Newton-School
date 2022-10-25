package Recursion;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/tnivvikyi4h1/
// Start
public class InsertOperator {
    public static boolean insert(long[] arr, int si, long res, long x) {
        // base case
        if (si == arr.length) {
            return res == x;
        }

        // either add
        if (insert(arr, si+1, res+arr[si], x))
            return true;

        // either subtract
        return insert(arr, si+1, res - arr[si], x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long x = sc.nextLong();

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        if(insert(arr, 0, 0, x))
            System.out.println("YES");
        else System.out.println("NO");
    }
}

// End
