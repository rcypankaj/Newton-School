package StringsTwoPointer;
import java.util.*;
// Question URL: https://my.newtonschool.co/playground/code/nieqbfk4r9fz/
// Start
public class DTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = sc.nextInt();

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int i = 0, j = i+2;
        int count = 0;

       while (j < n) {
           while (j < n && arr[j] - arr[i] <= x) {
               count += j - i - 1;
               j++;
           }
           i++;
           j = i+2;
       }
        System.out.println(count);
    }
}

// End