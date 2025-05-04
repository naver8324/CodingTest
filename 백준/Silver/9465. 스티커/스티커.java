import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] stickers = new int[2][n];
            int[][] dp = new int[2][n];

            for (int k = 0; k < 2; k++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    stickers[k][j] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][0] = stickers[0][0];
            dp[1][0] = stickers[1][0];
            if (n > 1) {
                dp[0][1] = dp[1][0] + stickers[0][1];
                dp[1][1] = dp[0][0] + stickers[1][1];

                for (int j = 2; j < n; j++) {
                    dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + stickers[0][j];
                    dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + stickers[1][j];
                }
            }
            sb.append(Math.max(dp[0][n - 1], dp[1][n - 1])).append("\n");
        }

        System.out.print(sb.toString());
    }
}