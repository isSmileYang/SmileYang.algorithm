package Greedy;

/**
 *中等题134. 加油站
 *在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 * 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
 */
public class GasStation {
    /**
     *一旦遇到第一个无法到达的点 i，直接更换起始点为 i+1。中间的 [1,i-1] 的点一定不是起始点
     * @param gas
     * @param cost
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;//选定起点到现在的油缸量
        int total = 0;//总的加油与耗油差值
        int result = 0;//选定的起点
        for(int i = 0;i<gas.length;i++){
            total += gas[i]-cost[i];
            if(sum<0){
                sum = gas[i]-cost[i];
                result = i;
            }
            else
                sum += gas[i]-cost[i];
        }
        //边界条件是能跑完全程
        return total>=0?result:-1;
    }
}
