import java.util.Scanner;

public class sortWrongNumber {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int result = getsortWrongNum(N);
        System.out.println(result);
    }
    //递归错排
    public static int getsortWrongNum (int N){
        if (N == 1)
            return 0;
        if (N == 2)
            return 1;
        else
            return (N - 1) * (getsortWrongNum(N - 1) + getsortWrongNum(N - 2));

    }
}