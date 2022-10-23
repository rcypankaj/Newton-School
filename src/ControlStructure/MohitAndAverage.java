package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/di6qoml8vll3/
// Start
public class MohitAndAverage {
    static int Average(int A, int B, int C) {
        return (A + B + C) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Average(a, b, c));
    }
}

// End