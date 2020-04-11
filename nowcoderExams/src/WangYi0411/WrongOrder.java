package WangYi0411;

import java.util.Scanner;

public class WrongOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T>0){
            T--;
            int[] a = new int[10000];
            int[] b = new int[10000];
            int n = in.nextInt();
            for(int i=1; i<=n; i++){
                a[i] = in.nextInt();
            }
            int mx = 0;
            int k = 0;
            Long sum = 0l;
            for(int i=1 ;i<=n; i++){
                b[i] = in.nextInt();
                if(b[i]>mx){ mx = b[i]; k=i;}
            }
            if(n%2==0){
                for(int i=1; i<=n; i++){
                    sum+=b[i];
                }
                System.out.println(sum);
            }
            else {
                if (a[1] < a[n]) {
                    for (int i = 2; i <=n; i++) {
                        sum += b[i];
                    }
                    sum += (n - 1) * b[1];
                    System.out.println(sum);
                }
                else{
                    for(int i=1; i<n;i++){
                        sum+=b[i];
                    }
                    sum += (n - 1) * b[n];
                    System.out.println(sum);
                }
            }
        }
    }
}
