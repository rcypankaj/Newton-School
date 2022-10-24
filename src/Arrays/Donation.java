package Arrays;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/oaqcheyhd8wf/
// Start
public class Donation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input element
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int max = arr[0];
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];

            if (max < arr[i]) max = arr[i];

            if (arr[i] < max) {
                System.out.print(max - arr[i]+" ");
                totalSum += (max - arr[i]);
            }
            else System.out.print(arr[i] - max+" ");
        }
        System.out.printf("\n%d",totalSum);
    }
}

// End
