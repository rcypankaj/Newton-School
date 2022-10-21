package InputOutput;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/oua6ug8f6gxs/
// Start
public class DataTypes {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);

        // print
        System.out.println(i);
        System.out.println(l);
        System.out.printf("%.2f\n",f);
        System.out.printf("%.4f\n", d);
        System.out.println(c);
    }
}

// End
