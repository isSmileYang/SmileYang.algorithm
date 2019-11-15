package Greedy;
import java.util.Arrays;

/**
 *贪心简单题455分发饼干
 */
 public class AssignCookie{
     public static int contentChildren(int[]g,int[]s){
         assert g.length>0||s.length>0;
         Arrays.sort(g);
         Arrays.sort(s);
         //定义第i个小孩的appetite对应第j块饼干
         int i=0,j=0;
         //当小孩没满足完或饼干没发完
         while(i<g.length&&j<s.length){
             if(g[i]<=s[j])
                 i++;
             j++;
         }
         //被满足的小孩个数
         return i;
     }
 }