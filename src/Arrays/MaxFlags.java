package Arrays;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/quoawydrphna/
// Start
public class MaxFlags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] flags = new int[n];

            int m = sc.nextInt();
            int[] arr = new int[m];

            // element in flags
            for (int i = 0; i < n; i++) flags[i] = 0;

            // input element arr
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }

            int max = flags[0];
            for (int i = 0; i < m; i++) {
                if (arr[i] - 1 < n) {
                    flags[arr[i] - 1]++;
                    max = Math.max(flags[arr[i] - 1], max);
                }

                if (arr[i] == n + 1) {
                    for (int j = 0; j < n; j++)
                        flags[j] = max;
                }

            }
            for (int j = 0; j < n; j++)
                System.out.print(flags[j] + " ");
        }

    }
}

// End
