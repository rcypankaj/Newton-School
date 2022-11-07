package Hashing;

import java.util.HashMap;
import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/efjgr5jj81ks/
// Start
public class FirstNonRepeatingCharacter {
    public static int findChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (map.containsKey(currChar))
                map.put(currChar, map.get(currChar)+1);
            else map.put(currChar, 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (map.get(currChar) == 1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(findChar(str));
    }
}
// End