package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/brluvn19wibc/
// Start
public class IceCream {
    static int leftOverIceCream(int N, int D) {
        int remaining;
        for (int i = 1; i <= D; i++) {
            int eaten = N/2;
            int rem = N - eaten;
            remaining = 3*rem;
            N = remaining;
        }
        return N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(leftOverIceCream(n,d));
    }
}

// End

