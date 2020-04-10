package SortAndSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectSort {
    public static int[] moveZeroes(int[] nums) {
        if(nums==null) return null;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                if(i != j)
                    swap(nums[i],nums[j]);
                j++;
            }
        }
        return nums;
    }
    private static void swap(int m , int n){
        int t = m;
        m = n;
        n = t;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] line = in.readLine().split(",");
        int[] nums = new int[line.length];
        for(int i = 0;i<line.length;i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        int[] out = moveZeroes(nums);
        System.out.print(out);
    }
}
