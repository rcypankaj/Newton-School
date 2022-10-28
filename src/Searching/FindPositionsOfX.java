package Searching;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/yen1cz8y8na0/
// Start
public class FindPositionsOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // test cases
        while (t-- > 0) {
            boolean check = false;
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];

            // input
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // find indices
            for (int i = 0; i < n; i++) {
                if (arr[i] == x) {
                    System.out.print(i + " ");
                    check = true;
                }
            }

            if (!check)
                System.out.print("Not Found");

            System.out.println();
        }
    }
}
// End
