package OJTemplate;

// 常见输出
public class Output {
    /**
     * 数组或者链表的输出格式  [1,2,3,4,5] 或者 {1 2 3 4 5}
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
