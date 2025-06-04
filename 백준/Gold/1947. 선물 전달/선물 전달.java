import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        final long MOD = 1_000_000_000;

        if (N == 1) {
            System.out.println(0);
            return;
        } else if (N == 2) {
            System.out.println(1);
            return;
        }

        long[] dp = new long[N + 1];

        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= N; i++) {
            dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]) % MOD;
        }

        System.out.println(dp[N]);
    }
}