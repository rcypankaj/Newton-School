package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/vhztbtefm515/
// Start
public class CheckDanger {
    static int QueenAttack(int X, int Y, int P, int Q){
        if (X == P || Y == Q || Math.abs(X-P) == Math.abs(Y-Q))
            return 1;
        else return 0;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        System.out.println(QueenAttack(X, Y, P, Q));
    }
}

// End
