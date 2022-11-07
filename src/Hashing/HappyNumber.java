package Hashing;

import java.util.Scanner;
import java.util.HashSet;
// Question URL: https://my.newtonschool.co/playground/code/3nggegdoy8gc/
// Start
public class HappyNumber {

    //  method return true if n is Happy Number
    public static boolean isHappyNumber(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n != 0) {
                int lastDigit = n%10;
                n/= 10;
                sum += (lastDigit * lastDigit);
            }
            n = sum;
            if (n == 1) return true;

            // when sum is already present in the hashset
            if (set.contains(n)) return false;
            else set.add(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isHappyNumber(n))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
// End