package Searching;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/tcdlbuznnlip/
// Start
public class SumOfCubes {
    public static boolean isSumOfCubes(int l, int h, long n) {
        while (l <= h) {
            long a = (long) Math.pow(l,3);
            long b = (long)Math.pow(h,3);
            long res = a+b;
            if (res < n)
                l += 1;
            if (res > n)
                h = h-1;
            if (res == n) {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int l = 0, h = 100000;

        if (isSumOfCubes(l,h,n))
            System.out.println("YES");
        else System.out.println("NO");

    }
}
// End
