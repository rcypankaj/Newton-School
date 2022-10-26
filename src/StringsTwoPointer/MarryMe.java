package StringsTwoPointer;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/9t7vpvbk6qxp/
// Start
public class MarryMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();
            if (str1.length() > str2.length()) {
                String temp = str1;
                str1 = str2;
                str2 = temp;
            }

            int i = 0, j = 0;

            while (i < str1.length() && j < str2.length()) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    i++;
                    j++;
                } else j++;
            }
            if (i == str1.length())
                System.out.println("#SadLife");
            else System.out.println("#DieSingle");
        }
    }
}

// End