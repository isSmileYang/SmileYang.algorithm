package Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 二维数组查找的普通解法，O(logN*M) ---matrix[M][N]
 * 二分查找方法空间复杂度更小，见leetCode-al
 */
public class MatrixSearch {
    public static  boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        //从右上角开始，比较target与右上角的数据的大小，如果大于target，就可以往左进一行，如果小于  target，就可以往下走一行
        while(i<m && j>= 0){
            if (matrix[i][j] > target){
                j--;
            }else if (matrix[i][j] < target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
          System.out.println("输入你需要的阶层数：");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        //定义需要的阶层数n
             int[][]array=new int[n][n];
             //定义一个n*n的数组array
          System.out.println("输入数组的各个元素：");
          for(int i=0;i<n;i++) {
              for (int j = 0; j < n; j++) {
                  array[i][j] = scan.nextInt();
              }
          }
          //给数组赋值
          System.out.println("你输入的数组为：");
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  System.out.print(array[i][j]+"\t");
                  if(j==n-1)
                      System.out.println();
              }
          }
    }
}
