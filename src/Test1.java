
public class Test1{
    public static void main(String[] args){
        try{
            //下行代码加在main方法最后，可让mainThread无限的睡眠。使用timer来控制程序的结束。
            Thread.sleep(Integer.MAX_VALUE);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}