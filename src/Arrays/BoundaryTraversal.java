package Arrays;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/drpgb3sbuivl/
// Start
public class BoundaryTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];

            // loop for input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int left = 0, right = m - 1;
            int top = 0, bottom = n - 1;

            // loop for printing first row
            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            // loop for printing last column
            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;

            if (top <= bottom)
            // loop for last row
            {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
            }
            bottom--;

            if (left <= right)
            // loop for printing first column
            {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
            }

        System.out.println();
        }
    }
}

// End