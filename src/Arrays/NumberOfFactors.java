package Arrays;

import java.util.*;
// Question URL: https://my.newtonschool.co/playground/code/n55ncsqmlt2g/
// Start
public class NumberOfFactors {
    // check prime
    public static boolean isPrime(int n) {
        boolean[] primes = new boolean[n+1];

        for (int i = 0; i < n+1; i++) {
            primes[i] = i != 1;
        }

        for (int i = 2; i < n+1; i++) {
            if (primes[i])
                for (int j = i+i; j < n+1; j += i)
                    primes[j] = false;
        }

        return primes[n];
    }

    public static int factor(int n, int idx) {
        int count = 0, p = idx;

        // check divisibility
        while ((n/p) > 0) {
            count += (n/p);
            p = p * idx;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long res = 1;

        // loop for calculating result
        for (int i = 1; i <= n; i++) {
            // check prime
            if (isPrime(i)) {
                res = res * (factor(n, i)+1);
            }
        }
        System.out.println(res);


    }
}

// End
