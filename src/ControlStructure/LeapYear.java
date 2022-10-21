package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/slaz9ovwxokx/
// Start
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
// End
