package exams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class GetDialogue {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0;i<n;i++){
            int m = Integer.parseInt(br.readLine());
            System.out.println(getdialogue(br.readLine(),m));
        }
    }
    private static String getdialogue(String s,int m){
        HashSet<String> st = new HashSet<>();
        String[] ids = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<m;i++){
            if(!st.contains(ids[i])){
                st.add(ids[i]);
                sb.append(ids[i]).append(" ");
            }
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}
