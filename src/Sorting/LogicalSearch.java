package Sorting;

import java.util.*;
// Question URL: https://my.newtonschool.co/playground/code/922y7e3y33rq/
// Start
public class LogicalSearch {
    public static int findMissing(int[] arr, int n) {
        int l = 0, h = n-1;
        int diff = (arr[h] - arr[l])/n;
        // System.out.println(diff);

        //binary search
        while (l <= h) {
            int mid = l + (h-l)/2;
            if (mid >= 0 && mid < n && arr[mid] - arr[mid-1] != diff)
                return arr[mid]-diff;

            if (arr[mid] - arr[0] == diff*mid)
                l = mid+1;
            else h = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMissing(arr,n));

    }
}
// End
