package Arrays;

import java.util.Scanner;
// Start
public class NoXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        long totalSum = 0;
        int j = 1;

        // input element
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int temp = (n - j)^ arr[i];

            if (temp > 0) totalSum += temp;
            j++;
        }
        System.out.println(totalSum);
    }
}

// End
