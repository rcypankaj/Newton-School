package Searching;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/nw0wnu3uxmrc/
// Start
public class CheckIfArrayISortedAndRotatedClockwise {
    public static boolean arraySortClockwise(int[] arr) {
        int a = 0, b = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1])
                a++;
            else b++;
        }

        if (a == 1 || b == 1) {
            if (arr[arr.length-1] < arr[0])
                a++;
            else b++;
        }
        return a == 1 || b == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            // input
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (arraySortClockwise(arr))
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
}

// End