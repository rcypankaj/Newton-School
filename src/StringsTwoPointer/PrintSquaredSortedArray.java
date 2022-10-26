package StringsTwoPointer;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/n4aj0mvbz8kx/
// Start
public class PrintSquaredSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // input
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr[i] = Math.abs(x);
            }

            // Selection sorting
            for (int i = 0; i < n-1; i++) {
                int smallest = i;
                for (int j = i+1; j < n; j++) {
                    if (arr[smallest] > arr[j])
                        smallest = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }

            // output print
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]*arr[i]+" ");
            }

            // each test case print next line
            System.out.println();
        }
    }
}
// End