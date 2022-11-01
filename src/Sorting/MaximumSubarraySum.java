package Sorting;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/4mg7pw5op9mk/
// Start
public class MaximumSubarraySum {
    public static void maxPossSumCont(int[] arr) {
        int maxConSum  = Integer.MIN_VALUE;
        int prefSum = 0;

        for (int j : arr) {
            prefSum += j;

            if (prefSum > maxConSum)
                maxConSum = prefSum;

            if (prefSum < 0) prefSum = 0;
        }

        System.out.println(maxConSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Kadane's Algorithm
        maxPossSumCont(arr);
    }
}

// End
