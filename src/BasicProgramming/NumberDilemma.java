package BasicProgramming;

import java.util.Scanner;
// Que URL: https://my.newtonschool.co/playground/code/vqmcvcfx7fex/
// Start
public class NumberDilemma {
    static int StringToInt(String S){
        int a = Integer.parseInt(S);
        return a;
    }

    static String IntToString(int N){
        String str = Integer.toString(N);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        System.out.println(IntToString(a));
        System.out.println(StringToInt(str));

    }
}
// End
