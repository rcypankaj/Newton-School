package StringsTwoPointer;

import java.util.*;
// Question URL: https://my.newtonschool.co/playground/code/amfo2yp23abk/
// Start
public class MinimizeXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            int temp = arr[i] ^ arr[i+1];
            if (temp < min1)
                min1 = temp;
        }
        System.out.println(min1);
    }
}

// End

