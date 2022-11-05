package Sorting;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// Question URL: https://my.newtonschool.co/playground/code/epz9m51l2fuw/
// Start
public class LongestSubArray {
    public static int findLongestSubArray(int[] arr, int k) {
        int maxLength = 0;
        int currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum == k)
                    maxLength = i+1;

            if (!map.containsKey(currSum))
                map.put(currSum, i);

            if (map.containsKey(currSum - k)) {
                int length = i - map.get(currSum - k);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // test cases
        while (t-- > 0) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);

            int[] arr = new int[n];

            String[] s1 = br.readLine().split(" ");
            //input
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(s1[i]);

            System.out.println(findLongestSubArray(arr, k));
        }
    }
}
// End