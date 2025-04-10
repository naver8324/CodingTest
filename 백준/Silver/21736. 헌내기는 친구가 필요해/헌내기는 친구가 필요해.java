import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static char[][] campus;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int metCount;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        campus = new char[N][M];
        visited = new boolean[N][M];

        int startX = -1;
        int startY = -1;

        for (int x = 0; x < N; x++) {
            String input = br.readLine();

            for (int y = 0; y < M; y++) {
                campus[x][y] = input.charAt(y);
                if (campus[x][y] == 'I') {
                    startX = x;
                    startY = y;
                }
            }
        }

        bfs(startX, startY);

        System.out.println(metCount == 0 ? "TT" : metCount);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = now[0] + dx[k];
                int ny = now[1] + dy[k];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny]) {
                    if (campus[nx][ny] != 'X') {
                        visited[nx][ny] = true;
                        if (campus[nx][ny] == 'P') {
                            metCount++;
                        }
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
