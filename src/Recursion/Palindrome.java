package Recursion;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/zifgtny9hl8y/
// Start
public class Palindrome {
    static boolean check_Palindrome(String str, int s, int e) {
        // base case
        if (s == e) return true;

        // not equal
        if (str.charAt(s) != str.charAt(e))
            return false;

        // equal
        if (s <= e) {
            return check_Palindrome(str, s+1, e-1);
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // test cases
        while (t-- > 0) {
            String str = sc.next();
            System.out.println(check_Palindrome(str, 0, str.length() - 1));
        }
    }
}

// End
