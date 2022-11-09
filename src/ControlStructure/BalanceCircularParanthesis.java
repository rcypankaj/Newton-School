package ControlStructure;

import java.util.Scanner;
// Question Check the parenthesis is balances or unbalanced.
// Start
public class BalanceCircularParanthesis {
    public static boolean isBalanced(String str)  {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (currChar == '(')
                count++;

            else count--;

            if (count < 0) return false;
        }

        return count == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bracketExpression = sc.next();

        if (isBalanced(bracketExpression))
            System.out.println("This is balanced parenthesis");
        else System.out.println("This is unbalanced parenthesis");
    }
}
// End