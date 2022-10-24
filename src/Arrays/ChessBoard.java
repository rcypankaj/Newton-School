package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// Question URL: https://my.newtonschool.co/playground/code/1qkd85ogelgu/
// Start
public class ChessBoard {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        // input
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] str1 = str.split(" ");
            for (int j = 0; j < n; j++)
                board[i][j] = Integer.parseInt(str1[j]);
        }

        int count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = (i+j) & 1;
                if (temp == board[i][j]) count1++;
                else count2++;
            }
        }

        System.out.println(Math.min(count1, count2));
    }
}

// End