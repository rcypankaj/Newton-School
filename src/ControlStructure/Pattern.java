package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/82bmunlaiw0x/
// Start
public class Pattern {
    static void printPattern(int N){
        for (int i = 0; i < N; i++) {
            int res = i*6;
            for (int j = 1; j <= N; j++) {
                System.out.print(res+" ");
                res += 4;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
}

// End
