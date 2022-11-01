package Sorting;
import java.util.Scanner;
import java.util.Arrays;

// Question Start: https://my.newtonschool.co/playground/code/lo4yjaqadmvl/
// Start
public class OddOccurring {
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

// Start
