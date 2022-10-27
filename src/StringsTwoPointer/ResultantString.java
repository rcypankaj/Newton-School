package StringsTwoPointer;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/sdz2i5z2fxeu/
// Start
public class ResultantString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();

        // print Xor string
        for (int i = 0; i < n; i++) {
            System.out.print(str1.charAt(i)^str2.charAt(i));
        }
    }
}
// End
