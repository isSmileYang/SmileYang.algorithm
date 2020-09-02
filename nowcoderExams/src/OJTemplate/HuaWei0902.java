package OJTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuaWei0902 {
    static class Candy implements Comparable<Candy> {
        int color;
        int value;
        int num;

        public Candy(int color, int value, int num) {
            this.color = color;
            this.value = value;
            this.num = num;
        }

        /*把list的单价排序改成逆序*/
        @Override
        public int compareTo(Candy o) {
            if (color != o.color) {
                return color - o.color;
            } else if (value != o.value) {
                return  o.value -value ;
            } else {
                return num - o.num;
            }
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);

        int[] nums = new int[N + 1];
        int[] colors = new int[N + 1];
        int type1 = 0, type2 = 0;

        for (int i = 1; i <= N; i++) {
            String[] strings = br.readLine().split(" ");
            nums[i] = (Integer.parseInt(strings[0]));
            colors[i] = Integer.parseInt(strings[1]);
            if (colors[i] == 1) type1++;
            if (colors[i] == 2) type2++;
        }

        if (type1 < 3 && type2 < 3) {
            System.out.println("null");
        }

        List<Candy> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int color = colors[i];
            int value = nums[i];
            list.add(new Candy(color, value, i));
        }

        /* 只有list中value进行了降序排列 */
        Collections.sort(list);

        int sum1 = 0, sum2 = 0;
        if (type2 >= 3) {
            sum2 = list.get(type1).value + list.get(type1 + 1).value + list.get(type1 + 2).value;
        }
        if (type1 >= 3) {
            sum1 = list.get(0).value + list.get(1).value + list.get(2).value;
        }
        if (sum1 > sum2) {
            System.out.print(list.get(0).num + " ");
            System.out.print(list.get(1).num + " ");
            System.out.print(list.get(2).num + " ");
            System.out.println();
            System.out.println(1);
            System.out.println(sum1);
        } else {
            System.out.print(list.get(type1).num + " ");
            System.out.print(list.get(type1 + 1).num + " ");
            System.out.print(list.get(type1 + 2).num + " ");
            System.out.println();
            System.out.println(2);
            System.out.println(sum2);
        }
    }
}
