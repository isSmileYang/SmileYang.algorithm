import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * 现给定所有种类月饼的库存量、总售价、以及市场的最大需求量，请你计算可以获得的最大收益是多少。
 * 假如我们有 3 种月饼，其库存量分别为 18、15、10 万吨，总售价分别为 75、72、45 亿元。如果市场的最大需求量只有 20 万吨，那么我们最大收益策略应该是卖出全部 15 万吨第 2 种月饼、以及 5 万吨第 3 种月饼，获得 72 + 45/2 = 94.5（亿元）。
 */
public class MoonCake {

    public static void main(String[] args) throws IOException {
        //每个测试用例先给出一个不超过 1000 的正整数 N 表示月饼的种类数、以及不超过 500的正整数 D 表示市场最大需求量。
        // 随后一行给出 N 个正数表示每种月饼的库存量；最后一行给出 N 个正数表示每种月饼的总售价。数字间以空格分隔。
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int N= Integer.parseInt(in[0]);
        int D = Integer.parseInt(in[1]);
        String[] m = br.readLine().split(" "),  p = br.readLine().split(" ");
        double result = moon(N,D,m,p);
        System.out.println(String.format("%.2f",result));
    }

    static class Cake implements Comparable<Cake> {
        double amount;
        double price;
        double value;

        public Cake(double amount, double price, double value) {
            this.amount = amount;
            this.price = price;
            this.value = value;
        }
        /*把list的sort排序改成逆序*/
        @Override
        public int compareTo(Cake o) {
            return value > o.value ? -1 : 1;
        }
    }

    public static double moon(int N, int D,String[] m, String[] p) {
        /* 将每种月饼的库存，总价和单价都存入list */
       List<Cake> list = new ArrayList<>();
       for (int i = 0;i<N;i++) {
           double memory = Double.parseDouble(m[i]);
           double price = Double.parseDouble(p[i]);
           list.add(new Cake(memory,price,price/memory));
        }
        /* list降序排列 */
        Collections.sort(list);
        /*总销 */
        double sale = 0;
        /* 每次加完注意把需求量减小！！！ */
        for(int i = 0;i<N;i++) {
            if ( list.get(i).amount<=D) {
                sale += list.get(i).price;
                D -= list.get(i).amount;
            } else {
                sale += list.get(i).value * D;
                break;
            }
        }
        return sale;
    }
}


