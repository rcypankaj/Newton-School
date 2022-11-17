package Recursion;

import java.util.Scanner;
// print all digits which have n digits that are strictly increasing
// start
public class PrintDigits {
    public static void helper(int i, String res, int n) {
        if (n == 0){
            System.out.print(res+" ");
            return;
        }
        for (int j = i; j <= 9; j++) {
            String currStr = Integer.toString(j);
            helper(j+1, res+currStr, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        helper(0, "", n);

    }
}
// End