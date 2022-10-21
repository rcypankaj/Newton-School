package InputOutput;
import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/5rtpjpqrje21/
// Start
public class FahrenheitToCelsius {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        short f = sc.nextShort();
        f = (short)(f - 32);
        f = (short)((f * 5)/9);
        System.out.println(f);
    }
}
// End
