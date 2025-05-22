import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] wine = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(wine[0]);
            return;
        } else if (N == 2) {
            System.out.println(wine[0] + wine[1]);
            return;
        }

        dp[0] = wine[0];
        dp[1] = wine[0] + wine[1];
        dp[2] = Math.max(Math.max(wine[0] + wine[1], wine[0] + wine[2]), wine[1] + wine[2]);

        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]), dp[i - 1]);
        }

        System.out.println(dp[N - 1]);
    }
}