import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution1154{
    public static int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length(); int n2 = text2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int i=0; i<n1; i++) { dp[i][0] = 0; }
        for(int j =0; j<n2; j++){ dp[0][j] = 0; }

        for(int i=1; i<=n1; i++){
            for(int j =1; j<=n2; j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + 1;
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text1 = in.readLine();
        String text2 = in.readLine();
        int ret = longestCommonSubsequence(text1, text2);
        System.out.print(ret);
    }
}
