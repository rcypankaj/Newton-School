package BasicProgramming;

import java.util.Scanner;

// Given a side of a square, your task is to calculate its area.
// Start
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side  = sc.nextInt();
        System.out.println(side * side);
    }
}
// End
