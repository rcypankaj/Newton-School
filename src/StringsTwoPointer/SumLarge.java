package StringsTwoPointer;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/27sm7yjl29nv/
// Start
public class SumLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        StringBuilder sb = new StringBuilder();
        byte carry = 0;
        int i = str1.length()-1, j = str2.length()-1;

        while (i >= 0 || j >= 0 || carry == 1) {
            int a = 0, b = 0;
            if (i >= 0)
                a = str1.charAt(i--)-'0';
            if (j >= 0)
                b = str2.charAt(j--)-'0';
            int sum = a+b+carry;
            carry = (byte)(sum/10);
            sb.append(sum%10);
        }
        System.out.println(sb.reverse());
    }
}

// End