import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int[][] fibonacci = new int[41][2];

        fibonacci[0][0] = 1;
        fibonacci[0][1] = 0;
        fibonacci[1][0] = 0;
        fibonacci[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            fibonacci[i][0] = fibonacci[i-1][0] + fibonacci[i-2][0];
            fibonacci[i][1] = fibonacci[i-1][1] + fibonacci[i-2][1];
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(fibonacci[N][0]).append(" ").append(fibonacci[N][1]).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}
