import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String line = bf.readLine(); // 读取第二行数据
        String[] s = line.trim().split(" ");
        Long[] arr =new Long[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = Long.valueOf(s[i]);
        }
        System.out.println(minMoney(arr));
    }
    public static Long minMoney(Long[] arr){
        Arrays.sort(arr);
        int group  = arr.length/3; Long sum = Long.valueOf(0);
        for(int k = 0;k< arr.length; k++){
            sum += arr[k];
        }
        if(arr.length%3 == 0){
            for(int i = 0 ; i< group; i++){
                  sum -= arr[i];
            }
        }
        else{
            int remain = arr.length%3;
            for(int i = remain; i<= group; i++){
                sum -= arr[i];
            }
        }
        return sum;
    }
}