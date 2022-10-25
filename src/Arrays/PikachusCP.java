package Arrays;

import java.util.*;
// Question URL: https://my.newtonschool.co/playground/code/i28yccbdy8j0/
// Start
public class PikachusCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10000001];

        // filling array by 0
        Arrays.fill(arr,0);

        // count unique prime factor
        for (int i = 2; i < 10000001; i++) {
            if (arr[i] == 0) {
                int j = i;
                while (j < 10000001) {
                    arr[j]++;
                    j += i;
                }
            }
        }
        int t = sc.nextInt();

        // test cases
        while (t-- > 0) {
            int ci = sc.nextInt();
            int cf = sc.nextInt();
            int f = sc.nextInt();

            int count = 0;
            for (int i = ci+1; i <= cf; i++) {
                if (f == arr[i]) count++;
            }

            if (count == 0)
                System.out.println(-1);
            else System.out.println(count);
        }
    }
}

// End
