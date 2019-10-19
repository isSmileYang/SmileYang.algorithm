import java.util.HashMap;
import java.util.Scanner;

/**
 *定义一个字符串常量，字符串中只有大小写字母和整数，
 * 输出字符串中的出现最多的数字的和？例如 ” 9fil3dj11P0jAsf11j ” 中出现最多的是11两次，输出22.
 */
public class sumMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            int result = solution(s);
            System.out.println(result);
        }
        sc.close();
    }
    public static int solution (String s) {
        String[] arr = s.split("[^0-9]");
        HashMap<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        int maxValue = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!"".equals(arr[i])) {
                if(map.containsKey(arr[i])) {
                    int times = map.get(arr[i]) + 1;
                    map.put(arr[i], times);

                }
                else {
                    map.put(arr[i], 1);
                }
                //存在空指针问题
                if(maxCount < map.get(i)&&map.containsKey(arr[i])){
                    maxCount = map.get(i);
                    maxValue = i;
                }
            }
        }

        return maxValue * maxCount;
    }

}

