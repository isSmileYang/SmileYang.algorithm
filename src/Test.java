import java.util.Scanner;

/**
 * 输入：N+1 功能：打印1和0的序列
 * 每行的长度都是2^N，一共有N+1行
 * 第一行全都是1（2^n个1）
 * 第二行是2^（n-1）个1后面是2^（n-1）个0
 * ...
 * 以此类推，最后一行就是1和0的摆动数列
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total=(int)Math.pow(2,N);
        printOneAndZero(total,total);
    }
    /**
     * 传入变化单组内的元素个数，比如1100为2 1010为1
     * @param total 每行的总元素个数
     * @param num 单组元素个数
     */
    public static void printOneAndZero(int num,int total){
        if(num==0)
            return;
        boolean flag=true;
        for(int i=1;i<=total;i++){
            System.out.print(flag?1:0);
            if(i%num==0)
                flag=!flag;
        }
        System.out.println();
        printOneAndZero(num/2,total);
    }
}

