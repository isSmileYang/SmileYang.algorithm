package Greedy;

import java.util.Scanner;

public class JumpGame {
    public static boolean canJump(int[] nums){
        assert nums.length>0;
        if(nums.length==1)return true;
        //数组首位为0且0不是唯一元素肯定跳不到最后
        if(nums.length>1&&nums[0]==0)return false;
        for (int i = 1; i < nums.length-1; i++) {
            int j = i - 1;
            while (nums[i] == 0) {
                //前面两个if是找到j的情况，说明这个0元素是可以被到达或跳过的
               // if (nums[j] >= i - j&&i==nums.length-1) break;
                if (nums[j] > i - j) break;
                if (j <= 0) return false;
                j--;
            }
        }
        return true;
    }

    //just for test
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String[] arr = s.split(",");
        int[] arry = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arry[i] = Integer.parseInt(arr[i]);
        }
        boolean result =canJump(arry);
        System.out.println(result);
    }
}
