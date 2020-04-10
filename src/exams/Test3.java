package exams;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++) {
            int n = input.nextInt();
            String s = input.next();
            char[] ch = new char[10000];
            for (int j=0; j<n; j++) {
                ch[j] = s.charAt(j);
            }
            for (int k=0; k<n; k++) {
                if (ch[k] == '0' && ch[k + 1] == '0') ch[k] = '1';
                else if(ch[k]=='0' && ch[k+1] == '1' && ch[k+2] == '0'){
                    ch[k] = '1'; ch[k+1] = '0';ch[k+2] = '1';
                }
            }
            for (int k = 0; k < n; k++) {
                System.out.print(ch[k]);
            }
            System.out.println();
        }
    }
}
