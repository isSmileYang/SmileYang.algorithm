package KeDaXunFei;

import java.util.Scanner;

public class resolvePrimerFactor {
    //n代表需要输入的正整数
    static int n,k = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        f(n);

    }
    public static void f(int n){
        while (k <= n){
            if(k == n){
                System.out.print(n);
                break;
            }else if(n>k && n%k == 0){
                System.out.print(k + "*");
                n = n/k;
                f(n);
                break;
            }else if (n>k && n%k != 0){
                k++;
                f(n);
                break;
            }
        }
    }

}
