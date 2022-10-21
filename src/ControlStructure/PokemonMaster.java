package ControlStructure;

import java.util.Scanner;

public class PokemonMaster {
    static int isTakePokeball(int A, int B){
        if (A >= B)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(isTakePokeball(A, B));
    }
}
