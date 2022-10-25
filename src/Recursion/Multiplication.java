package Recursion;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/yqv45xaybezq/
// Start
public class Multiplication {
    static int  Multiply_by_recursion(int M, int N) {
        return N * M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // test case
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            //print
            System.out.println(Multiply_by_recursion(n,m));
        }
    }
}

// End
