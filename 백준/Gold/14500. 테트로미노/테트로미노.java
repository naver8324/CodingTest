import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[][] paper;
    static int max = -1;
    static int[][][] tetromino = {
            // ㅡ
            {{0, 0}, {0, 1}, {0, 2}, {0, 3}},
            {{0, 0}, {1, 0}, {2, 0}, {3, 0}},
            // ㅁ
            {{0, 0}, {1, 0}, {0, 1}, {1, 1}},
            // ㅏ
            {{0, 0}, {1, 0}, {1, 1}, {2, 0}},
            {{0, 0}, {0, 1}, {0, 2}, {1, 1}},
            {{1, 0}, {0, 1}, {1, 1}, {2, 1}},
            {{0, 1}, {1, 0}, {1, 1}, {1, 2}},
            //
            {{0, 1}, {1, 0}, {1, 1}, {2, 0}},
            {{0, 0}, {0, 1}, {1, 1}, {1, 2}},
            //
            {{0, 0}, {1, 0}, {1, 1}, {2, 1}},
            {{0, 1}, {0, 2}, {1, 0}, {1, 1}},
            // L
            {{0, 0}, {1, 0}, {2, 0}, {2, 1}},
            {{0, 0}, {1, 0}, {0, 1}, {0, 2}},
            {{0, 0}, {0, 1}, {1, 1}, {2, 1}},
            {{1, 0}, {1, 1}, {1, 2}, {0, 2}},
            // J
            {{0, 1}, {1, 1}, {2, 1}, {2, 0}},
            {{0, 0}, {1, 0}, {1, 1}, {1, 2}},
            {{0, 0}, {0, 1}, {1, 0}, {2, 0}},
            {{0, 0}, {0, 1}, {0, 2}, {1, 2}}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        paper = new int[N][M];

        for (int x = 0; x < N; x++) {
            st = new StringTokenizer(br.readLine());
            for (int y = 0; y < M; y++) {
                paper[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                check(x, y);
            }
        }

        System.out.println(max);
    }

    private static void check(int x, int y) {
        for (int[][] shape : tetromino) {
            int sum = 0;

            for (int[] block : shape) {
                int nx = x + block[0];
                int ny = y + block[1];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    sum += paper[nx][ny];
                }
            }

            max = Math.max(max, sum);
        }
    }
}