package SortAndSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionTwoArrays349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        //if(nums1.length ==0|| nums2.length==0) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n1:nums1){
            map.put(n1,map.getOrDefault(n1,0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0; i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        String[] parts1 = input.split(",");
        int[] nums1 = new int[parts1.length];
        for(int index = 0; index < parts1.length; index++) {
            nums1[index] = Integer.parseInt(parts1[index]);
        }
        input = in.readLine();
        String[] parts2 = input.split(",");
        int[] nums2 = new int[parts2.length];
        for(int index = 0; index < parts2.length; index++) {
            nums2[index] = Integer.parseInt(parts2[index]);
        }
        int[] ret = intersection(nums1, nums2);
        System.out.print(ret);
    }
}
