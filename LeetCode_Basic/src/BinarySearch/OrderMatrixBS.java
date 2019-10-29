package BinarySearch;
/**
 * 二分查找搜索二维数组已知最快的方法了（内存消耗最少）
 * 空间复杂度O(1)时间复杂度O(log(n*m))
 */

public class OrderMatrixBS {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        //注意防止空数组
        if (m == 0) return false;
        int n = matrix[0].length;
        // 注意索引下标值
        int  start= 0, end = m * n - 1;
        int pivotIdx, pivotElement;
        //注意等于号！
        while ( start <=end) {
            //不直接用相加/2是防止相加数太大会溢出
            pivotIdx = start +(end-start) / 2;
            //二维数组的行数是index/n,列数是index%n
            pivotElement = matrix[pivotIdx / n][pivotIdx % n];
            //找到目标语句
            if (target == pivotElement) return true;
                //注意两个边界变换时都不包括中位数！
            else {
                if (target < pivotElement) end = pivotIdx - 1;
                else start = pivotIdx + 1;
            }
        }
        return false;
    }
}
