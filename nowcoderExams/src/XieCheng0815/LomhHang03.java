package XieCheng0815;

import java.util.Arrays;
import java.util.HashMap;

public class LomhHang03 {
    public static void main(String[] args){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('k',1);
        map.put('s',2);
        map.put('h',3);
        map.put('p',4);
        map.put('q',5);

        String[] arr=new String[]{"s1","s3","s9","s4","h1","q5","q9","p3","p2","p5","q4","k2","k1","s12","s13","p12",
                "q13","q11"};
        Arrays.sort(arr,(s1, s2)->{
            if(s1.charAt(0)!=s2.charAt(0)){
                return map.get(s1.charAt(0))-map.get(s2.charAt(0));
            }else{
                return Integer.parseInt(s1.substring(1))-Integer.parseInt(s2.substring(1));
            }
        });
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

