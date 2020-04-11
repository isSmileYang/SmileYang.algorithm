package WangYi0411;

import java.util.Scanner;

/**
 * 集合操作
 */
public class CollectionOpreation {
    static int[] a = new int[1000001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T>0){
            T--;
            for (int i = 1; i <= 100001; i++) {
                a[i] = i;
            }
            int n = in.nextInt();
            int m = in.nextInt();
            int k =n;
            for(int i = 0;i<m;i++){
                int x;
                x = in.nextInt();
                if(x==1){
                    int q = in.nextInt();
                    int w = in.nextInt();
                    a[fin(q)] =  fin(w);
                }
                else if(x==2){
                    int y = in.nextInt();
                    k++;
                    a[y] =k;
                }
                else{
                    int y =in.nextInt();
                    int sum = 0;
                    for(int j=1;j<=n;j++){
                        if(fin(y)==fin(j)) sum++;
                    }
                    System.out.println(sum);
                }
            }
        }
    }
    private static int fin(int x){
        if(a[x]==x)
            return x;
        else{
            a[x]=fin(a[x]);
            return a[x];
        }
    }
}

