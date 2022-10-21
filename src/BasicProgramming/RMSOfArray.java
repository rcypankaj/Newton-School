package BasicProgramming;

import java.util.Scanner;

// URL of this Question: https://my.newtonschool.co/playground/code/ik5hrblrg1by/
// Start
public class RMSOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte[] arr = new byte[n];
        int res = 0;

        // loop for input
        for (byte i = 0; i < n; i++) {
            arr[i] = sc.nextByte();
        }

        // loop for res value
        for (byte i = 0; i < n; i++) {
            res += arr[i] * arr[i];
        }
        double fRes = (double)res/n;
        fRes = Math.sqrt(fRes);
        System.out.printf("%.6f",fRes);
    }
}
// End
