package SortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class niuniu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String aString = sc.nextLine();
        String bString = sc.nextLine();
        String[] astr = aString.split(",");
        String[] bstr = bString.split(",");
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(astr[i]);
            b[i] = Integer.parseInt(bstr[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(a);
        System.out.println(b);
    }
}