package Sorting;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/6dj4t6e4l2ua/
// Start
public class WaveArray {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (pivot > arr[j]){
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
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

        // Quick Sort Algorithm Implement
        quickSort(arr, 0, n-1);

        for (int i = 0; i < n-1; i += 2) {
            if (i == n-1) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

// End