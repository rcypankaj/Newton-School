package StringsTwoPointer;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/8dt01pq15fcm/
// Start
public class CleanTheRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] strArr = new String[n];

        // input
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (strArr[i].equals(strArr[j]))
                    count++;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
// End
