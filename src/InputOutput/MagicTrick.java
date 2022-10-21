package InputOutput;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/wqbceswqqupo/
// Start
public class MagicTrick {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = sc.nextShort();
        short b = sc.nextShort();

        System.out.println((2 * a + b) / 2);
    }
}
// End