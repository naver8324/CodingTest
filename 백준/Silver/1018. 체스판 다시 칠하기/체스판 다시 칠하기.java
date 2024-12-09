import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int cost1 = calculateCost(board, i, j, 'W');
                int cost2 = calculateCost(board, i, j, 'B');
                minimum = Math.min(minimum, Math.min(cost1, cost2));
            }
        }

        System.out.println(minimum);

        br.close();
    }

    private static int calculateCost(char[][] board, int x, int y, char startColor) {
        int cost = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expectedColor = ((i + j) % 2 == 0) ? startColor : (startColor == 'W' ? 'B' : 'W');
                if (board[x + i][y + j] != expectedColor) {
                    cost++;
                }
            }
        }
        return cost;
    }
}
