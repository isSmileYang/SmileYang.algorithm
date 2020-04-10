package strings;

public class Compress443 {
    public int compress(char[] chars) {
        if(chars.length == 0) return 0;
        int p=0; int left=0;
        while(left<chars.length){
            int right = left+1;
            chars[p++] = chars[left];
            while(right<chars.length && chars[left]==chars[right]){
                right++;
            }
            if(right-left >1){
                String temp = String.valueOf(right-left);
                for(char ch:temp.toCharArray()){
                    chars[p++] = ch;
                }
            }
            left = right;
        }
        return p;
    }
}
