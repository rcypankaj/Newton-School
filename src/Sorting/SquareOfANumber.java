package Sorting;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/f269vzmttj6l/
// Start
public class SquareOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += n;
        }
        System.out.println(res);
    }
}
// End
