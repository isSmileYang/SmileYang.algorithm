import java.util.Scanner;

public class supplyGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int L = in.nextInt();
        int[][] arr = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int row = in.nextInt();
        int col = in.nextInt();;
        
    }
}
