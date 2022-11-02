package Sorting;
import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/rcf1xijyclo4/
// Start
public class NumberOfMerge {
    static int countmerge = 0;
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        countmerge++;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] > arr[idx2])
                merged[x++] = arr[idx2++];
            else merged[x++] = arr[idx1++];
        }

        while (idx1 <= mid)
            merged[x++] = arr[idx1++];

        while (idx2 <= ei)
            merged[x++] = arr[idx2++];

        for (int i = 0, j= si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    public static void divide(int[] arr, int si, int ei) {
        // base case
        if (si >= ei) return;
        int mid = si + (ei - si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        // Merging
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Merge Sort
        divide(arr, 0, n-1);


        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(countmerge);

    }
}

// End