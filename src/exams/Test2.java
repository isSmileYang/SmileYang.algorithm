package exams;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long mod = 1000000007l;
        while (input.hasNext()) {
            Long n = input.nextLong();
            Long l = input.nextLong();
            if (n == 0 && l == 0) {
                break;
            }
            Long sum = 0l;
            Long k = n;
            while(l>0){
                sum+=k;
                sum%=mod;
                k=k*n%mod;
                l--;
            }
            System.out.println(sum);
        }
    }
}


