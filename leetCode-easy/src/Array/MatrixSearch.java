package Array;

import java.util.ArrayList;

/**
 * 二维数组查找的普通解法，O(logN*M) ---matrix[M][N]
 * 二分查找方法空间复杂度更小，见leetCode-al
 */
public class MatrixSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
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

}
