package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/phe2iq69q1ey/
// Start
public class FindingRoots  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = sc.nextShort();
        short b = sc.nextShort();
        short c = sc.nextShort();

        // loop for took out common
        for (int i = 2; i <= a; i++) {
            if (a%i == 0 && b%i == 0 && c%i == 0){
                a /= i;
                b /= i;
                c /= i;
            }
        }

        byte val = 0;
        short val1 = (short)((b*b) - (4*a*c));
        if (val1 < 0) {
            val = 1;
        }

        switch (val) {
            case 0:
                double val2 = Math.sqrt(val1);
                System.out.printf("%.2f\n",(val2-b)/(2*a));
                System.out.printf("%.2f",(-val2-b)/(2*a));
                break;

            case 1:
                double val3 = Math.abs(val1);
                val3 = Math.sqrt(val3);
                System.out.printf("-%.2f+i%.2f\n",(double)b/(2*a), val3/(2*a));
                System.out.printf("-%.2f-i%.2f\n",(double)b/(2*a), val3/(2*a));
        }
    }
}
// End
