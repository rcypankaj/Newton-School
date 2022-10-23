package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/s8vcc0pkp47u/
// Start
public class Pattern1 {
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
// End
