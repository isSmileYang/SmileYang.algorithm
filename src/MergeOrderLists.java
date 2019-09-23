import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  合并>2个有序数组，写项目的思路
 */
public class MergeOrderLists {
    public static void main(String [] args){
        //输入两个有序数组
        Scanner input = new Scanner(System.in);
        String oneString = input.nextLine();
        String twoString = input.nextLine();
        List<Character> result = mergeOrderList(oneString,twoString);
        System.out.println(result);
    }

    public static List<Character> mergeOrderList(String oneString, String twoString) {
        //判断子串是否与主串的某段相等
        char[] read = oneString.toCharArray();
        char[] video = twoString.toCharArray();
        //合并两个有序list到返回的新list
        ArrayList<Character> mergeList = new ArrayList<>();

        //两个字符串都存在
        int i = 0, j = 0, tmp = 0;
        // 遍历两个记录表，将发生的记录有按最近联系依次赋给resultList
        while (i < read.length && j < video.length && tmp < video.length + read.length) {
            if (read[i] <= video[j]) {
                mergeList.add(read[i++]);
                tmp++;
            }
            //插入视频问诊或门诊
            else {
                mergeList.add(video[j++]);
                tmp++;
            }
        }
        //如果阅读数组遍历完了,剩下数组直接返回视频排序
        while (i < read.length) {
            mergeList.add(read[i++]);
            tmp++;
        }
        //如果没有后两个while，就会indexOutOfException
        while (j < video.length) {
            mergeList.add(video[j++]);
            tmp++;
        }
        return mergeList;
    }
}
