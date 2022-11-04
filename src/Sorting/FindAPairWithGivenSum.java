package Sorting;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/40md68l5ys50/
// Start
public class FindAPairWithGivenSum {
    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (pivot > arr[j]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;

        return i;
    }
    public static void QuickSort(int[] arr, int si, int ei) {
        if (si < ei) {
            int pidx =  partition(arr, si, ei);
            QuickSort(arr, si, pidx-1);
            QuickSort(arr, pidx+1, ei);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        // Quick Sort
        QuickSort(arr, 0, n-1);

        int i = 0, j = n-1;
        while (i <= j) {
             if (arr[i]+arr[j] == k) {
                 System.out.println("Pair found ("+arr[j]+", "+arr[i]+")");
                 return;
             }
            if (arr[i]+arr[j] > k)
                j--;
            else i++;
        }
        System.out.println("Pair not found");
    }
}

// End