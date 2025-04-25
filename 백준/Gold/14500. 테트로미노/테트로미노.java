import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] map;
    static int max = 0;

    static int[][][] tetromino = {
        {{0,0}, {0,1}, {0,2}, {0,3}},
        {{0,0}, {1,0}, {2,0}, {3,0}},

        {{0,0}, {0,1}, {1,0}, {1,1}},

        {{0,0}, {1,0}, {2,0}, {2,1}},
        {{0,1}, {1,1}, {2,1}, {2,0}},
        {{0,0}, {0,1}, {1,0}, {2,0}},
        {{0,0}, {0,1}, {1,1}, {2,1}},

        {{0,0}, {1,0}, {1,1}, {1,2}},
        {{0,2}, {1,0}, {1,1}, {1,2}},
        {{0,0}, {0,1}, {0,2}, {1,2}},
        {{0,0}, {0,1}, {0,2}, {1,0}},

        {{0,0}, {0,1}, {1,1}, {1,2}},
        {{0,1}, {1,0}, {1,1}, {2,0}},
        {{0,0}, {1,0}, {1,1}, {2,1}},
        {{0,1}, {0,2}, {1,0}, {1,1}},

        {{0,0}, {0,1}, {0,2}, {1,1}},
        {{0,1}, {1,0}, {1,1}, {2,1}},
        {{0,1}, {1,0}, {1,1}, {1,2}},
        {{0,0}, {1,0}, {1,1}, {2,0}},
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                map[i][j] = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                check(i, j);
            }
        }

        System.out.println(max);
    }

    static void check(int x, int y) {
        for (int[][] shape : tetromino) {
            int sum = 0;
            boolean valid = true;

            for (int[] block : shape) {
                int nx = x + block[0];
                int ny = y + block[1];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    valid = false;
                    break;
                }

                sum += map[nx][ny];
            }

            if (valid) {
                max = Math.max(max, sum);
            }
        }
    }
}
