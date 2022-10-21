package BasicProgramming;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/lgk1nzno2wb8/
// Start
public class TriangleOfHeightN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();

        // Loop for rows
        for (byte i = 1; i <= n; i++) {
            // loop for columns
            for (byte j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
// End
