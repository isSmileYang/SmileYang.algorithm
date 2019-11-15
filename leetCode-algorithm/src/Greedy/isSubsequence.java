package Greedy;

/**
 * 贪心算法简单题392. 判断子序列
 */
public class isSubsequence {
    /**
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
     *字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        if(0==s.length()) return true;
        //母串序列索引i，子串j
        int sub = 0,j = 0;
        //循环标准需要出现两个同时满足
        while( sub<s.length()&&j< t.length()){
            //如果不同只有母串后移
            if(s.charAt(sub)==t.charAt(j))
                sub++;
            j++;
        }
        //返回结果里判别是否子串全找到了，很有技巧
        return  sub==s.length();
    }
}