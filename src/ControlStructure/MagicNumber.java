package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/z4oew5mhi89f/
// Start
public class MagicNumber {
    public static boolean isMagicNumber(int n) {
        boolean seven = false, nine = false;

        while (n != 0) {
            int lastDigit = n % 10;
            n /= 10;

            if (lastDigit == 9)
                nine = true;

            if (lastDigit == 7)
                seven = true;
        }
        return seven && nine;
    }
    static int findMagicNumber(int N){
        int a = N;
        int b = N;
        while (true) {
            if (isMagicNumber(b))
                return b;
            b--;

            if (isMagicNumber(a)) {
                return a;
            }
            a++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        System.out.println(findMagicNumber(n));
    }
}

// End