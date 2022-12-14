package Searching;
import java.util.*;
// Questio URL: https://my.newtonschool.co/playground/code/mdhxhdunwitz/
// Start
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        //input array 1
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // input array 2
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int n1 = n+m;
        // craeted new array
        int[] arr = new int[n1];
        int j = 0;

        // loop for input in new array
        for (int i = 0; i < n1; i++) {
            if (i < n)
                arr[i] = arr1[i];
            else
                arr[i] = arr2[j++];
        }
        int x;
        Arrays.sort(arr);
        double res;
        if (arr.length%2 == 0) {
            x = arr.length/2;
            res = (arr[x]+arr[x-1]);
            res /= 2;
        }
        else res = arr[arr.length/2];

        System.out.printf("%.2f", res);


    }
}

// End