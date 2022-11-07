package Hashing;

import java.util.Scanner;
import java.util.HashMap;
// Question URL: https://my.newtonschool.co/playground/code/vy1yt1ykduzm/
// Start
public class SubarraysWithEqual1sAnd0s {
    public static long count1sAnd0s(int[] arr) {
        long res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;

        for (int val : arr){
            sum += (val == 0)?-1:1;

            if (map.containsKey(sum)) {
                res += map.get(sum);
                map.put(sum, map.get(sum)+1);
            }
            else map.put(sum, 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];

        //input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(count1sAnd0s(arr));
    }
}

// End
