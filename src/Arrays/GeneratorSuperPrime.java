package Arrays;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/zvk93ijtjwmc/
// Start
public class GeneratorSuperPrime {
    public static void SuperPrimes(int n){
        for (int i = (n/2+1); i <= n; i++)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SuperPrimes(n);
    }
}

// End
