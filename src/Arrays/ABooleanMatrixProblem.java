package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
// Question URL: https://my.newtonschool.co/playground/code/jyy4tk4aqw83/
// Start
public class ABooleanMatrixProblem {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short t = Short.parseShort(br.readLine());

        // for test cases loop
        while(t-- > 0) {
            String str = br.readLine();
            String[] str1 = str.split(" ");
            short n = Short.parseShort(str1[0]);
            short m = Short.parseShort(str1[1]);
            short[][] bMat = new short[n][m];

            boolean[] arr = new boolean[n];
            Arrays.fill(arr,false);

            // input
            for (int i = 0; i < n; i++) {
                String str2 = br.readLine();
                String[] str3 = str2.split(" ");
                for (int j = 0; j < m; j++) {
                    bMat[i][j] = Short.parseShort(str3[j]);
                }
            }

            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    if (bMat[i][j] == 1) {
                        arr[i] = true;
                        break;
                    }


            // print
            for (int i = 0; i < n; i++) {
                if (arr[i]) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(1+ " ");
                    }
                }
               else {
                    for (int j = 0; j < m; j++) {
                        System.out.print(0+ " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
// End
