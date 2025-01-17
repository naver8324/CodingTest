import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] scores = new int[T + 1];
        int[] dp = new int[T + 1];
        int max = 0;

        for (int i = 1; i <= T; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        if (T == 1) {
            dp[T] = scores[T];
        } else if (T == 2) {
            dp[T] = scores[T - 1] + scores[T];
        } else {
            dp[1] = scores[1];
            dp[2] = scores[1] + scores[2];
            for (int i = 3; i <= T; i++) {
                dp[i] = Math.max(dp[i - 2], dp[i - 3] + scores[i - 1]) + scores[i];
            }
        }

        System.out.println(dp[T]);
        br.close();
    }
}
