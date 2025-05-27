import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MOD = 10007;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] dp = new int[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int n = 2; n <= N; n++) {
            dp[n][0] = dp[n - 1][0];
            for (int d = 1; d < 10; d++) {
                dp[n][d] = (dp[n][d - 1] + dp[n - 1][d]) % MOD;
            }
        }

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result + dp[N][i]) % MOD;
        }

        System.out.println(result);
    }
}
