package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/fjxwb5azdtam/
// Start
public class LoopDebugging {
    public static void For_Loop(int n){
        for(int i=2;i<=n;i+=2){
            System.out.print(i+" ");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        For_Loop(n);
    }
}

// End
