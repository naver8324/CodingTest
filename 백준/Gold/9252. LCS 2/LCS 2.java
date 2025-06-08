import java.io.*;
import java.util.*;

public class Main {
    static char[] str1;
    static char[] str2;
    static int[][] dp;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str1 = br.readLine().toCharArray();
        str2 = br.readLine().toCharArray();
        dp = new int[str1.length + 1][str2.length + 1];

        for (int i = 1; i <= str1.length; i++) {
            for (int j = 1; j <= str2.length; j++) {
                if (str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        sb.append(dp[str1.length][str2.length]).append("\n");
        getLCS();

        System.out.print(sb.toString());
    }

    private static void getLCS() {
        if (dp[str1.length][str2.length] == 0) {
            return;
        }

        int i = str1.length;
        int j = str2.length;

        StringBuilder lcs = new StringBuilder();

        while (i > 0 && j > 0) {
            if (str1[i - 1] == str2[j - 1]) {
                lcs.append(str1[i - 1]);
                i--;
                j--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }

        sb.append(lcs.reverse());
    }
}