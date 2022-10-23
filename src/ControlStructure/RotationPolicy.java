package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/dc3kwlhrqsak/
// Start
public class RotationPolicy {
    static int countDays(int A, int B){
        int count = 0;

        for (int i = A; i <= B; i++) {
            if ( i%6 == 0 || i%6 == 2)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(countDays(a,b));

    }
}

// End
