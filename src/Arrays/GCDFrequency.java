package Arrays;

import java.util.*;
// Question URL: https://my.newtonschool.co/playground/code/6a8svyv2pkrp/
// Start
public class GCDFrequency {
    public static int GCD(int num1, int num2) {
        return num1%num2 == 0? num2 :GCD(num2, num1%num2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = 0;

        // loop for counting same element and calculating sum
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (arr[i] == arr[j]) count++;
            res += GCD(arr[i], count);
        }
        System.out.println(res);

    }
}

// End