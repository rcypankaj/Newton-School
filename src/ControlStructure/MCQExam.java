package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/hbbycveqlwit/
// Start
public class MCQExam {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        p = Math.max(p,q);
        p = Math.max(p,r);
        p = Math.max(p,s);
        System.out.println(p);
    }
}

// End
