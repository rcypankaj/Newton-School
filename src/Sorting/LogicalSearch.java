package Sorting;

import java.util.*;
// Question URL: https://my.newtonschool.co/playground/code/922y7e3y33rq/
// Start
public class LogicalSearch {
    public static int findMinOccurence(int[] arr, int n) {
        for (int i = 0; i < n; i += 2) {
            if (i == n-1) return arr[i];
            else {
                if (arr[i] != arr[i+1]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(findMinOccurence(arr,n));
    }
}
// End
