package Searching;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/tb6i3spaehrw/
// Start
public class FindIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();

        long l = 0, h = 1000000000;
        while (l <= h) {
           long mid = l + (h - l)/2;

           long a = mid * mid;
           long ans = a +(3*mid);
           if (ans == k) {
               System.out.println(mid);
               return;
           }
           if (ans < k) {
               l = mid + 1;
           }
           if (ans > k) {
               h = mid - 1;
           }
       }
        System.out.println(-1);
    }
}

// End
