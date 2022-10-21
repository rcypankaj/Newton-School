package BasicProgramming;

import java.util.Scanner;
// Question Url: https://my.newtonschool.co/playground/code/vglw7v4gl1hx/
// Start
public class RamGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte c = sc.nextByte();
        byte d = sc.nextByte();

        short res = (short) (a + b + c + d);
        System.out.println(res / 4);

    }
}

// End
