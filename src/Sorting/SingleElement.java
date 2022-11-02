package Sorting;
import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/cdrdd191gq10/
// Start
public class SingleElement {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 2) {
            if (i == n-1)
                System.out.println(arr[i]);

            else {
                if (arr[i] != arr[i+1]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
// End