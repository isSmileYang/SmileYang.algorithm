package Greedy;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(0==s.length()) return true;
        //母串序列索引i，子串j
        int i = 0,j = 0;
        //循环标准需要出现两个同时满足
        while( i<s.length()&&j< t.length()){
            //如果不同只有母串后移
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        //返回结果里判别是否子串全找到了，很有技巧
        return  i==s.length();
    }
}