package StackAndQueue;

import java.util.Random;
import java.util.Stack;

public class Main {
    private static double testStack(Stack<Integer> stack,int count){
        long startTime = System.nanoTime();
        Random random = new Random();
        for(int i = 0; i<count; i++)
            stack.push(random.nextInt(Integer.MAX_VALUE));
        for(int i=0;i<count; i++)
            stack.pop();
        long endTime = System.nanoTime();
        return(endTime - startTime)/1000000000.0;
    }
    public static void main(String[] args){
        int count = 100000;
    }

}
