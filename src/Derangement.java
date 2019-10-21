import java.util.Scanner;

/**
 * 数学错排问题
 * N个人去旅行，在旅店开了N个房间，钥匙挂在大厅的墙上，钥匙上没有标号，每人随手拿一把钥匙，请用程序实现算出所有人都拿错钥匙的可能性有几种。
 */
public class Derangement {
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
