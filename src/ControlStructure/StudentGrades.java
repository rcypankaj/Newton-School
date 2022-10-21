package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/nyz5oj7a2n0i/
// Start
public class StudentGrades {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte c = sc.nextByte();
        byte d = sc.nextByte();
        byte e = sc.nextByte();

        short x = (short)((a + b + c + d + e)/5);
        if (x >= 80)
            System.out.println("A");
        else if (x >= 60)
            System.out.println("B");
        else if (x >= 40)
            System.out.println("C");
        else
            System.out.println("D");
    }
}

// End