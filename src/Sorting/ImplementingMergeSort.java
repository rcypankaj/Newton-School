package Sorting;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/8da9kp6867nj/
// Start
public class ImplementingMergeSort {
    public static int[] implementMergeSort(int[] arr, int start, int end) {
        divide(arr, start, end);
        return arr;

    }

    public static void divide(int[] arr, int start, int end) {
        // base case
        if(start >= end) return;

        int mid = start + (end - start)/2;

        implementMergeSort(arr, start, mid);
        implementMergeSort(arr, mid+1, end);

        conquer(arr, start, mid, end);
    }

    public static void conquer(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= end) {
            if (arr[idx1] < arr[idx2])
                merged[x++] = arr[idx1++];

            else merged[x++] = arr[idx2++];
        }

        while (idx1 <= mid)
            merged[x++] = arr[idx1++];

        while (idx2 <= end)
            merged[x++] = arr[idx2++];

        for (int i = 0, j = start; i < merged.length; i++, j++)
            arr[j] = merged[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // input
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] newArr = implementMergeSort(arr, 0, n-1);

            for (int i = 0; i < n; i++) {
                System.out.print(newArr[i]+" ");
            }
        }
    }
}

// End