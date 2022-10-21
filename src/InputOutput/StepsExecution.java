package InputOutput;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/9pbxbmalszrp/
// Start
public class StepsExecution {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        short a = sc.nextShort();

        a += 8;
        a /= 3;
        a %= 5;
        a *= 5;
        System.out.println(a);
    }
}
// End