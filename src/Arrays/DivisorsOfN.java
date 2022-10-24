package Arrays;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/ln11a3m28tha/
// Start
public class DivisorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int count = 0;

            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) count++;

                    if (i * i != n){
                        if((n/i)%2 == 0)
                            count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
// End
