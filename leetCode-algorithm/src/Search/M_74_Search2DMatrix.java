package Search;

import java.io.IOException;

public class M_74_Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int row = m-1; int col = 0;
        while(row >= 0 && col < n ){
            if(matrix[row][col] > target){
                row--;
            }else if (matrix[row][col] > target){
                col++;
            }else{
                return true;
            }
        }
        return false;
    }

    /**
     * leetcode74搜索二维矩阵
     * 二分查找搜索二维数组已知最快的方法了（内存消耗最少）
     * 空间复杂度O(1)时间复杂度O(log(n*m))
     */
    public static boolean searchMatrixBy2(int[][] matrix, int target) {
        // matrix.length表示行数;matrix[0].length表示列数
        int m = matrix.length;
        int n = matrix[0].length;

        //注意防止空数组
        if (m == 0) return false;

        // 注意索引下标值
        int  start= 0, end = m * n - 1;
        int pivotIdx, pivotElement;
        //注意=
        while ( start <=end) {
            //不直接用相加/2是防止相加数太大会溢出
            pivotIdx = start +(end-start) / 2;
            //把矩阵拆成了一个一维的有序数组，一维数组下标pivotIdx对应的pivotElement行数是index/n,列数是index%n
            pivotElement = matrix[pivotIdx / n][pivotIdx % n];
            //找到目标语句
            if (target == pivotElement) return true;
                //注意两个边界变换时都不包括中位数！
            else if (target < pivotElement) end = pivotIdx - 1;
            else start = pivotIdx + 1;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        int[][] matrix = new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(matrix, 13));

    }

}
