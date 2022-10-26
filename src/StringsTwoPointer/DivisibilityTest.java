package StringsTwoPointer;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/4x2ofmfdiasd/
// Start
public class DivisibilityTest {
    public static boolean isDivisible(String str, int n) {
        int res = 0;

        for(int i = 0; i < str.length(); ++i) {
            res = (res * 10 + (str.charAt(i) - 48)) % n;
        }

        return res == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (isDivisible(str, 30)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

// End