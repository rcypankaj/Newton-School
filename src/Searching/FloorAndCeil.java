package Searching;

import java.util.Scanner;
// Question URL: https://my.newtonschool.co/playground/code/e7azn3bgkydj/
// Start
public class FloorAndCeil {
    static void floorAndCeil(int[] a, int N, int x){
        int l = 0, h = a.length-1;
        // binary search
        while (l <= h) {
            int mid = l + (h - l)/2;
            if (a[mid] < x)
                l = mid+1;
            if (a[mid] > x)
                h = mid - 1;
            if (a[mid] == x) {
                System.out.println(a[mid]+" "+a[mid]);
                return;
            }
        }
        int temp = l;
        l = h;
        h = temp;
        if (l >= 0) System.out.print(a[l]+" ");
        else System.out.print(-1+" ");
        if (h < a.length) System.out.print(a[h]+" ");
        else System.out.print(-1+" ");
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        //input
        for (int i=  0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            int k = sc.nextInt();
            floorAndCeil(a, n, k);
        }
    }
}

// End
