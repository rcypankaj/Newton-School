package Arrays;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/dlo1kuascdmx/
// Start
public class NthNumberMadeOfPrimeDigits {
    public static StringBuilder findDigit(int n) {
        StringBuilder res = new StringBuilder();

        // loop for character check
        while (n != 0) {
            int digit = n%4;
            switch (digit) {
                case 0:
                    res.append('7');
                    break;
                case 1:
                    res.append('2');
                    break;
                case 2:
                    res.append('3');
                    break;
                case 3:
                    res.append('5');
            }
            if (n % 4 == 0) {
                n--;
            }
            n /= 4;
        }
        return res.reverse();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // loop for test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(findDigit(n));

        }
    }
}

// End