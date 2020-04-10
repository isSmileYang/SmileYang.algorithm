package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubstringWithoutRepeatingCharacters {
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int sum = 0; int i=0;
        for(int j = 0; j<n;j++){
            if(s.charAt(i)==s.charAt(j)){
                sum = Math.max(sum,j-i);
                i = j;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
            int ret = lengthOfLongestSubstring(line);
            String out = String.valueOf(ret);
            System.out.print(out);
    }
}
