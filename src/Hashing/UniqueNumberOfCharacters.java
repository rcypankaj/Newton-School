package Hashing;

import java.util.Scanner;
import java.util.HashSet;
// Question URL: https://my.newtonschool.co/playground/code/ex14wwbk8gbb/
// Start
public class UniqueNumberOfCharacters {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < n.length(); i++) {
            set.add(n.charAt(i));
        }
        System.out.println(set.size());
    }
}
// End