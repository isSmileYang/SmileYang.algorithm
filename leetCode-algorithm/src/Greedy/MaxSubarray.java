package Greedy;

import java.util.Scanner;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 输入[-2,1,-3,4,-1,2,1,-5,4]；输出6；因为连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSubarray {
    /**
     *
     * @param nums
     */
    public static int maxSubarray(int[] nums) {
        //sum存子序和，max表示选好子序手标的某次的和
        int sum = nums[0];
        int max = 0;
        for(int i=0;i<nums.length;i++){
            //if(max+nums[i]<nums[i])
            if(max<0) max = nums[i];
            else max+=nums[i];
            //如果不加这个结果就会子序数组首标找对，尾标可能加进没有使整体<0但变小的数
            sum = Math.max(sum,max);
        }
        return sum;
    }

    //just for test
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s= input.next();
        String[] arr = s.split(",");
        int[] arry = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arry[i]=Integer.parseInt(arr[i]);
        }
        int result = maxSubarray(arry);
        System.out.println(result);
    }
}
