package StringsTwoPointer;

import java.util.*;

public class FLAMES {
    public static String relation(int res) {
        String ans = "";
        switch (res){
            case 0: ans = "Siblings";
            break;
            case 1: ans = "Friends";
            break;
            case 2: ans = "Love";
            break;
            case 3: ans = "Affection";
            break;
            case 4: ans = "Marriage";
            break;
            case 5: ans = "Enemy";
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        // occurence
        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i)-'a']++;
        }

        // occurence
        for (int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i)-'a']++;
        }

        int res = 0;
        for (int i = 0; i < 26; i++) {
            res += Math.abs(arr1[i]-arr2[i]);
        }

        System.out.println(relation(res%6));
    }
}
