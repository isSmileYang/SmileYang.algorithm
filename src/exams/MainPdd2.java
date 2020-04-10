package exams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPdd2 {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();// 读取第一行数据
        String[] str = line.trim().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        line = input.readLine(); // 读取第二行数据
        String[] s = line.trim().split(" ");
        // 创建一个int型的数组用来储存第二行的个数字
        int[] nums = new int[n];
        for (int i = 0; i < n; i ++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        System.out.println(Intervals(nums,m));
    }
    private static int Intervals(int[] nums,int m){
        int res = 1; int sum =0;//sum记录某个区间的长度
        int i=0;
        while(i<nums.length){ //区间长度
             int j = 0;
             while (j<i){
                 sum += nums[i+j];
                 j++;
             }
             if(sum%m==0) res++;
             i++;
        }
        return res;
    }
}
