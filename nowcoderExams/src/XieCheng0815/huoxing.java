package XieCheng0815;

import java.util.Scanner;

public class huoxing {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[]=new int[100];
        int location=0;
        while(num!=0){
            int remain=num%3;
            num=num/3;
            arr[location]=remain;
            location++;
        }
        String s = "";
        for(int i=location-1;i>=0;i--){
            if(arr[i] == 2){
                System.out.print(s+"&");
            }
            if(arr[i] == 1){
                System.out.print(s+"$");
            }
            if(arr[i] == 0){
                System.out.print(s+"@");
            }
        }
        System.out.println(s);
    }
}
