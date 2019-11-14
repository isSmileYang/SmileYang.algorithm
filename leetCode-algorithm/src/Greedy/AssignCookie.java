package Greedy;
import java.util.Arrays;
 public class AssignCookie{
     public static int contentChildren(int[]g,int[]s){
         assert g.length>0||s.length>0;
         Arrays.sort(g);
         Arrays.sort(s);
         //定义第i个小孩的胃口对应第j块饼干
         int i=0,j=0;
         while(i<g.length&&j<s.length){
             if(g[i]<=s[j])
                 i++;
             j++;
         }
         return i;
     }
 }