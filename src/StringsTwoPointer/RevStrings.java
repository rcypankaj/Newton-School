package StringsTwoPointer;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/swae9etcaio5/
// Start
public class RevStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // loop for reverse String
        for (int i = str.length()-1; i >= 0; i--)
            System.out.print(str.charAt(i));
    }
}
// End
