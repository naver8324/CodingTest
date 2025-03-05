import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int[] dp = new int[10];

        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for (int i = 3; i < 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            sb.append(dp[N - 1]).append("\n");
        }

        System.out.print(sb.toString());
    }
}