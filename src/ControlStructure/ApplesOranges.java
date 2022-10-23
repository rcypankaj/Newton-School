package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/mpl1zjeh1kdn/
// Start
public class ApplesOranges {
    static int LikesBoth(int N, int A, int B){
        A = A + B;
        N = A - N;
        return N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(LikesBoth(a,b,c));
    }
}

// End