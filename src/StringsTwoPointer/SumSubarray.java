package StringsTwoPointer;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/v1lp1306e5pv/
// Start
public class SumSubarray {
    public static int smallestSubWithSum(int[] a, int n, long k) {
        long curr_sum = 0;
        int min_length = n;
        int start = 0, end = 0;

        while (end < n) {
            while (end < n && curr_sum < k)
                curr_sum += a[end++];

            while (curr_sum >= k && start < n) {
                if (end - start < min_length) {
                    min_length = end - start;
                }

                curr_sum -= a[start++];
            }
        }

        return min_length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        int[] arr = new int[n];
        //input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // print output
        System.out.println(smallestSubWithSum(arr, n, k));
    }
}
// End

