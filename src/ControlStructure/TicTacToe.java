package ControlStructure;

import java.util.Scanner;

public class TicTacToe {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        char Rick = 'R';
        char Jerry = 'J';
        char Draw = 'D';

        if (Rick == char1 || Rick == char2)
            System.out.println(Rick);
        else if (char1 == Jerry)
            System.out.println(char2);
        else if (char2 == Jerry)
            System.out.println(char1);
        else
            System.out.println(Draw);
    }
}

// End