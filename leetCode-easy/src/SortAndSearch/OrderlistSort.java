package SortAndSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//

/**
 * 合并两个有序数组，这里是普通的重新排序,来自项目灵感
 */

public class OrderlistSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String oneString = input.nextLine();
        String twoString = input.nextLine();
        List<Character> result = mergeOrderList(oneString, twoString);
        System.out.println(result);
    }

    public static List<Character> mergeOrderList(String oneString, String twoString) {
        char[] read = oneString.toCharArray();
        char[] video = twoString.toCharArray();
        ArrayList<Character> mergeList = new ArrayList();
        int i = 0;
        int j = 0;
        int tmp = 0;

        while(i < read.length && j < video.length && tmp < video.length + read.length) {
            if (read[i] <= video[j]) {
                mergeList.add(read[i++]);
                ++tmp;
            } else {
                mergeList.add(video[j++]);
                ++tmp;
            }
        }

        while(i < read.length) {
            mergeList.add(read[i++]);
            ++tmp;
        }

        while(j < video.length) {
            mergeList.add(video[j++]);
            ++tmp;
        }

        return mergeList;
    }
}


