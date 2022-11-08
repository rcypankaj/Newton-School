package Hashing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
// Question URL: https://my.newtonschool.co/playground/code/1q8p3cqv39et/
// Start
public class SortCharactersByFrequency {
    public static StringBuilder frequencySort(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (map.containsKey(currChar))
                map.put(currChar, map.get(currChar)+1);
            else
                map.put(currChar, 1);
        }

        List<Character>[] bucket = new List[str.length()+1];
        for (Character key :map. keySet()){
            int frequency = map.get(key);
            if (bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i]) {
                    for (int j = 0; j < map.get(c); j++) {
                        sb.append(c);
                    }
                }
            }
        }

        return sb;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(frequencySort(str));
    }
}
// End