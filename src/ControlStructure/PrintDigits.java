package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/kj03vyi7jq0t/
// Start
public class PrintDigits {
    public static void printDigitInWords(int firstDigit) {
        switch (firstDigit) {
            case 0:
                System.out.print("zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
        }
    }
    static void Print_Digits(int N){
        int findDigit = 10000000;
        boolean check = false;
        while (findDigit != 0) {
            int firstDigit =  N/findDigit;
            N %= findDigit;

            if (firstDigit != 0)
                check = true;

            if (check) {
                printDigitInWords(firstDigit);
            }
            findDigit /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print_Digits(n);
    }

}

// End
