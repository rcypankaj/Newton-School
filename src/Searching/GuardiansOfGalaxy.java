package Searching;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/xnn421zii61z/
// Start
public class GuardiansOfGalaxy {
    public static boolean validThrust(int[] arr , int x) {
        for (int j : arr) {
            x = (2 * x) - j;
            if (x >= 100000)
                return true;
            if (x < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = 0, h = 100000;
        int res = 0;
        while (l <= h) {
            int mid = l + (h-l)/2;
            if (validThrust(arr, mid)) {
                res = mid;
                h = mid - 1;
            }
            else l = mid + 1;
        }
        System.out.println(res);
    }
}
// End