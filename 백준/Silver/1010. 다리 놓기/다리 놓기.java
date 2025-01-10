import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[31][31];

        for (int i = 0; i <= 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for (int i = 2; i <= 30; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int westSite = Integer.parseInt(st.nextToken());
            int eastSite = Integer.parseInt(st.nextToken());
            sb.append(dp[eastSite][westSite]).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}
