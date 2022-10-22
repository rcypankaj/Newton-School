package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/ve5g34zis0o3/
// Start
public class Race {
    static char checkWinner(int A,int B,int C){
        A = Math.abs(C-A);
        B = Math.abs(B-C);

        if (A < B) return 'N';
        if (A > B) return 'S';
        return 'D';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(checkWinner(a,b,c));
    }
}

// End
