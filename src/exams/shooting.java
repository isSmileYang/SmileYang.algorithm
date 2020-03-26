package exams;

import java.util.Scanner;

import static java.lang.Math.pow;

public class shooting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int p = in.nextInt();
        int q =in.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        int ans = findExpect(N,p,q,arr);
        System.out.println(ans);
    }
    public static int findExpect(int N, int p,int q,int[] arr){
        int res =0;
        int[] expect= new int[N];
        if(p==0||q==0||N==0) return 0;
        for(int i = 0;i<N;i++){
            expect[i] =(int)(arr[i]*(pow(pow(p*q,-1),i+1) * pow(1-pow(p*q,-1),N-i+1)));
        }
        for(int j=0;j<N;j++){
            res += expect[j];
        }
        return res;
    }
}
