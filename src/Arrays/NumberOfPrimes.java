package Arrays;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/8066xl1fh774/
// Start
public class NumberOfPrimes {
    public static int SOE(int n) {
        boolean[] primes = new boolean[n+1];

        // loop for making all element primes
        for (int i = 0; i <= n; i++)
            primes[i] = true;

        // loop for separate non primes
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                for (int j = i+i; j <= n; j += i) primes[j] = false;
            }
        }

        int count = 0;

        // loop for counting primes
        for (int i = 2; i <= n; i++)
            if (primes[i]) count++;

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(SOE(n));

    }
}

// End