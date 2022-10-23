package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/pdogbngsfwwx/
// Start
public class Pattern2 {
    static void pattern(int N){
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j == 1; j++)
                System.out.print("*");

            for (int j = 1; j <= i - 1 && i < N; j ++)
                System.out.print("^");

            for (int j = 2; j <= i && j <= 2; j++)
                System.out.print("*");

            for (int j = 1; j < N && i == N; j++)
                System.out.print("*");

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}

// End