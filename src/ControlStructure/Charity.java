package ControlStructure;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/6pj57fealbor/
// Start
public class Charity {
    static int countClothes(int N, int M){
        int res = M/N;
        if (res > 1) return res;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(countClothes(N,M));
    }
}
// End
