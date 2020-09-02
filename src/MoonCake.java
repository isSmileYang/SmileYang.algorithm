import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * 现给定所有种类月饼的库存量、总售价、以及市场的最大需求量，请你计算可以获得的最大收益是多少。
 * 每个测试用例先给出一个不超过 1000 的正整数 N 表示月饼的种类数、以及不超过 500的正整数 D 表示市场最大需求量。
 *  随后一行给出 N 个正数表示每种月饼的库存量；最后一行给出 N 个正数表示每种月饼的总售价。数字间以空格分隔。
 */
public class MoonCake {
    //使用内部类优先考虑设为静态，这样外部类MoonCake就像内部类Cake的包空间，也可以不用内部类
    static class Cake implements Comparable<Cake> {
        double amount;
        double price;
        double value;
         /* 必须自定义这个构造函数，不然下文无法向list.add三个参数 */
        public Cake(double amount, double price, double value) {
            this.amount = amount;
            this.price = price;
            this.value = value;
        }
        /*把list的单价排序改成逆序*/
        @Override
        public int compareTo(Cake o) {
            return value > o.value ? -1 : 1;
        }
    }

    /**
     * 测试用例（结果：94.5）
     * 3 20
     * 18 15 10
     * 75 72 45
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int N= Integer.parseInt(in[0]);
        int D = Integer.parseInt(in[1]);
        String[] nums = br.readLine().split(" "), colors = br.readLine().split(" ");



        /* 将每种月饼的库存，总价和单价都存入list */
       List<Cake> list = new ArrayList<>();
       for (int i = 0;i<N;i++) {
           double memory = Double.parseDouble(nums[i]);
           double price = Double.parseDouble(colors[i]);
           list.add(new Cake(memory,price,price/memory));
        }
        /* 只有list中value进行了降序排列 */
        Collections.sort(list);

        /*总销 */
        double sale = 0;
        /* 每次加完把需求量D减小！！！ */
        for(int i = 0;i<N;i++) {
            if ( list.get(i).amount<=D) {
                sale += list.get(i).price;
                D -= list.get(i).amount;
            } else {
                sale += list.get(i).value * D;
                break;
            }
        }
        System.out.println(String.format("%.2f",sale));
    }
}


