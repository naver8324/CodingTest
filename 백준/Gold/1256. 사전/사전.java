import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long[][] dp = new long[N + 1][M + 1];

        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i <= M; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                dp[i][j] = Math.min(dp[i - 1][j] + dp[i][j - 1], 1_000_000_000); // 오버플로 방지
            }
        }

        if (dp[N][M] < K) {
            System.out.println("-1");
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (N > 0 && M > 0) {
            if (K <= dp[N - 1][M]) {
                sb.append("a");
                N--;
            } else {
                sb.append('z');
                K -= dp[N - 1][M];
                M--;
            }
        }

        while (N-- > 0) {
            sb.append("a");
        }
        while (M-- > 0) {
            sb.append("z");
        }

        System.out.println(sb.toString());
        br.close();
    }
}
