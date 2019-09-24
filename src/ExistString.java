
import java.util.Scanner;

/**
 * 2019/9/24 判断子串是否与主串的某段相等
 */
public class ExistString {
    public static void main(String [] args){
        //输入参数为三个：主字符串，子字符串，分隔符
        // (例如：主字符串:1,bv,443s,9s9s  子字符串：9s9s  分隔符: ，)
        Scanner input = new Scanner(System.in);
        String mainString = input.nextLine();
        String subString = input.nextLine();
        boolean result = jugdeExist(mainString,subString);
        System.out.println(result);

    }

    private static boolean jugdeExist(String mainString,String subString){
        if (null!= mainString){
            String[] forArray = mainString.split(",");
            for (String roleId : forArray) {
                if(roleId.equals(subString))
                    return true;
            }
        }
        return false;
    }

}