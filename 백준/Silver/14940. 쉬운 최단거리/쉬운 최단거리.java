import java.io.*;
import java.util.*;

public class Main {
    static int[][] map, answer;
    static boolean[][] visited;
    static int n;
    static int m;


    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];
        answer = new int[n][m];

        int startX = 0;
        int startY = 0;

        for (int x = 0; x < n; x++) {
            st = new StringTokenizer(br.readLine());
            for (int y = 0; y < m; y++) {
                int a = Integer.parseInt(st.nextToken());
                map[x][y] = a;
                if (a == 2) {
                    startX = x;
                    startY = y;
                }
            }
        }

        bfs(startX, startY);

        StringBuilder sb = new StringBuilder();

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (map[x][y] == 1 && answer[x][y] == 0) {
                    sb.append("-1 ");
                } else {
                    sb.append(answer[x][y]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        answer[x][y] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
                    if (map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        answer[nx][ny] = answer[curX][curY] + 1;
                        queue.offer(new int[]{nx, ny});
                    } else {
                        visited[nx][ny] = true;
                        answer[nx][ny] = 0;
                    }
                }
            }
        }
    }
}
