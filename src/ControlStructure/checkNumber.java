package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/va2tc85h5nhe/
// Start
public class checkNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0)
            a = 1;
        switch (a){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Positive");
                break;
            default:
                System.out.println("Negative");
        }
    }
}

// End
