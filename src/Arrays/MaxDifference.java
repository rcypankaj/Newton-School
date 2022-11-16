package Arrays;

import java.util.Scanner;
// find the maximum difference in which our first element should lesser than our next element.
// start
public class MaxDifference {
    public static void maxDiff(int[] arr, int n){
        int min = arr[0];
        int maxDifference = 0;
        for (int i = 1; i < n; i++) {
            if (min < arr[i])
                maxDifference = Math.max(maxDifference, arr[i]-min);
            else min = arr[i];
        }

        System.out.println(maxDifference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxDiff(arr, n);
    }
}
// End