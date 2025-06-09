import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        final int MOD = 10007;

        int[][] dp = new int[N][10];

        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < N; i++) {
            dp[i][0] = dp[i - 1][0];

            for (int j = 1; j < 10; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
            }
        }

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result + dp[N - 1][i]) % MOD;
        }

        System.out.println(result);
    }
}