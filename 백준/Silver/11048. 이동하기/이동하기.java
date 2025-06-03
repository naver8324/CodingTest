import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        int[][] dp = new int[N][M];

        for (int x = 0; x < N; x++) {
            st = new StringTokenizer(br.readLine());
            for (int y = 0; y < M; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = map[0][0];

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                if (x + 1 < N) {
                    dp[x + 1][y] = Math.max(dp[x + 1][y], dp[x][y] + map[x + 1][y]);
                }
                if (y + 1 < M) {
                    dp[x][y + 1] = Math.max(dp[x][y + 1], dp[x][y] + map[x][y + 1]);
                }
                if (x + 1 < N && y + 1 < M) {
                    dp[x + 1][y + 1] = Math.max(dp[x + 1][y + 1], dp[x][y] + map[x + 1][y + 1]);
                }
            }
        }

        System.out.println(dp[N - 1][M - 1]);
    }
}