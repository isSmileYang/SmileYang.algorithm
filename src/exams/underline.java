package exams;


import java.util.*;

public class underline {
    // 输入 ___aaa__b____c_dd___
    // 输出 aaa_b_c_dd

    static public String delete_(String str){
        StringBuilder sb = new StringBuilder(str);
        // 去除首位 的 '_'
        while (sb.charAt(0) == '_'){
            sb.deleteCharAt(0);
        }
        // 去除末位 的 '_'
        while (sb.charAt(sb.length() - 1) == '_'){
            sb.deleteCharAt(sb.length() - 1);
        }
        // 去除 中间的 '_'
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '_' && sb.charAt(i + 1) == '_'){
                sb.deleteCharAt(i + 1);
                // 注意 这里有个 i--; 成功删除了一个字符，得往回走了一个
                i--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String ans = delete_(str);
        System.out.println(ans);
    }

}
