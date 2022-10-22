package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/1a8sl1rdo9b1/
// Start
public class Knight {
    static int countKnightMove(int X, int Y){
        int count = 0;

        if (X-2 >= 1 && Y+1 <=8) count++;
        if (X-2 >= 1 && Y-1 >= 1) count++;
        if (X-1 >= 1 && Y-2 >= 1) count++;
        if (X+1 <= 8 && Y-2 >= 1) count++;
        if (X+2 <= 8 && Y-1 >= 1) count++;
        if (X+2 <= 8 && Y+1 <= 8) count++;
        if (X+1 <= 8 && Y+2 <= 8) count++;
        if (X-1 >= 1 && Y+2 <= 8) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println(countKnightMove(X, Y));

    }
}

// End
