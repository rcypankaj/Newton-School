package Recursion;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/1hdvq5la96fu/
// Start
public class CricketFever {
    public static int findWinner(int[] arr) {
        int n = arr.length/2;

        int[] newArr = new int[n];

        for (int i = 0; i < arr.length; i += 4) {
            if (arr[i] < arr[i+1]) {
                newArr[i/2] = arr[i+1];
                newArr[i/2 + 1] = arr[i];
            }
            else {
                newArr[i/2] = arr[i]; // 3         2 3 4 1 3 5 6 8
                newArr[i/2 + 1] = arr[i+1];
            }

            if (arr[i+2] < arr[i+3]) {
                newArr[i/2+1] += arr[i+3];
                newArr[i/2] += arr[i+2];
            }
            else {
                newArr[i/2+1] += arr[i+2];
                newArr[i/2] += arr[i+3];
            }
        }

        // base case
        if (n == 2) return Math.max(newArr[0], newArr[1]);
        return findWinner(newArr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (int)Math.pow(2, n);
       int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findWinner(arr));
    }
}

// End
