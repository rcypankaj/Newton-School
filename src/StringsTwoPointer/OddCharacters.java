package StringsTwoPointer;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/ayr5hu5fqwc9/
// Start
public class OddCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (i%2 == 0)
                System.out.print(str.charAt(i)+" ");
        }
    }
}

// End