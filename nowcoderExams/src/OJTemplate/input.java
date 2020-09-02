//package OJTemplate;
//
//import java.util.Scanner;
//
//public class input {
////输入描述第一行是一个正整数n，表示二维数组有n行n列。
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n=scan.nextInt();//定义需要的阶层数n
//        int[][]array=new int[n][n];//定义一个n*n的数组array
//        System.out.println("输入数组的各个元素：");
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < n; j++)
//                array[i][j] = scan.nextInt();
//        }
//    }
//
//    /**
//     * 输入描述：第一行是一个正整数T，表示有T组测试数据。
//     * 之后每组数据有三行，第一行为n（1<=n<=10000），第二行有n个正整数，第三行也有n个正整数；都在整数范围内。
//     * @param args
//     */
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int T = in.nextInt();
//        while(T>0){
//            T--;//为了保证输出的第一行会换行
//            //a和b分别放每组测试用例的第二行和第三行
//            int[] a = new int[10000];
//            int[] b = new int[10000];
//            int n = in.nextInt();
//            for(int i=1; i<=n; i++){
//                a[i] = in.nextInt();
//            }
//            for(int i=1 ;i<=n; i++){
//                b[i] = in.nextInt();
//            }
//        }//将输入带到function()方法里去运算
//        System.out.println(function(a,b));
//    }
//
//    /**
//     * 输入描述：每行输入两个数分别为 N 和 L ,直到N 和 L为止;结果对1000000007取模
//     */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Long mod = 1000000007l;
//        while (input.hasNext()) {
//            Long n = input.nextLong();
//            Long l = input.nextLong();
//            if (n == 0 && l == 0) {
//                break;
//            }//将输入带到function()方法里去运算
//            System.out.println(function(n,l)%mod);
//        }
//    }
//
//    /**
//     * 输入描述：
//     * 输入数据有多组, 每行表示一组输入数据。
////     * 每行不定有n个整数，空格隔开。(1 <= n <= 100)。
//     * @param args
//     */
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNextLine()){
//            String [] s=sc.nextLine().split(" ");
//            int sum=0;
//            for(int i=0;i<s.length;i++){
//                sum=sum+Integer.parseInt(s[i]);
//            }
//            System.out.println(sum);
//        }
//    }
//
//}
