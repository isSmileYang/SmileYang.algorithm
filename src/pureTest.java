import java.util.ArrayList;

/**
 * 用来做一些小细节验证的类
 */
public class pureTest {
        public static void main(String[] args) {
        //第一个测试,8是随便给的
            ArrayList result1= firstTest(8);
            System.out.println(result1);

        //第二个测试,5是随意的数组下标
            int result2 = secondTest(5);
            System.out.println(result2);
        }

        //1.测试m++和++m在while循环里操作，果然是有区别的
        public static ArrayList firstTest(int m){
            ArrayList arr = new ArrayList(10);
            while (m--!=0) {
                //根据源码可知，add(index,element)在此用会下标越界，因为会做检查。而add（element）不会
                 arr.add(m);
            }
            return arr;
        }

    //2.测试取模运算
       public static int secondTest(int index){
        int i = index%3;
        return i;
        }

}
