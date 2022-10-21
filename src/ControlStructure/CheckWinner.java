package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/fj4uxl7hylaf/
// Start
public class CheckWinner {
    static int DragonSlayer(int A, int B, int C,int D){
        boolean it = true;

        while (A > 0 && C > 0) {
            if (it) {
                A -= D;
            }
            else C -= B;
            it = !it;
        }

        if (A > C) return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(DragonSlayer(A, B, X, Y));
    }
}

// End
