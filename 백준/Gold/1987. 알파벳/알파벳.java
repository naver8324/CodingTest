import java.io.*;
import java.util.*;

class Main{
    static int[][] A;
    static boolean[] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int max, R, C;


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        A = new int[R][C];
        visited = new boolean[26];
        max = 0;

        for (int i = 0; i < R; i++) {
            String input = br.readLine();

            for (int j = 0; j < C; j++) {
                A[i][j] = input.charAt(j) - 65;
            }
        }

        DFS(0, 0, 1);

        System.out.println(max);
    }

    private static void DFS(int x, int y, int count) {
        if (visited[A[x][y]]) {
            return;
        }

        max = Math.max(max, count);

        visited[A[x][y]] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                if (!visited[A[nx][ny]]) {
                    DFS(nx, ny, count + 1);
                    visited[A[nx][ny]] = false;
                }
            }
        }
    }
}