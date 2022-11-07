package Hashing;

import java.util.Scanner;
import java.util.HashMap;
// Question URL: https://my.newtonschool.co/playground/code/vz3v59iab976/
// Start
public class LargestSubarrayWithZeroSum {
    public static int longestSubarray(int[] arr) {
        int maxLength = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum == 0)
                maxLength = i+1;

            if (map.containsKey(currSum))
                maxLength = Math.max(maxLength, i - map.get(currSum));
            else map.put(currSum, i);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(longestSubarray(arr));
    }
}
// End
