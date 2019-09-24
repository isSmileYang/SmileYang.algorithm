import java.util.Scanner;

/**
 * 给定区间[-2的31次方, 2的31次方]内的3个整数A、B和C，请判断A+B是否大于C。
 *2019/9/25
 */
public class AplusBandC {

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。
    int n = sc.nextInt();
    boolean[] result = new boolean[n];
    for (int i = 0; i < n; i++) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        //为了避免溢出，不能有+运算的存在！
        if ((c - a) < b)
            result[i] = true;
        else
            result[i] = false;
    }
    // 对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。
    for (int i = 0; i < n; i++) {
        System.out.println("Case #" + (i + 1) + ": " + result[i]);
    }
}
}

