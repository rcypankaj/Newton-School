package BasicProgramming;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/tostflsb0fvi/
// Start
public class StringTypecast {
    static String checkConevrtion(int a) {
        String str = Integer.toString(a);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(checkConevrtion(a));
    }
}

// End
