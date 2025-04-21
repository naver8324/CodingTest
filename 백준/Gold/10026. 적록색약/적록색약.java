import java.util.*;

public class Main {
    static int N;
    static char[][] map;
    static boolean[][] visited;
    static final int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static final int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        visited = new boolean[N][N];
        int normal = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, map[i][j], false);
                    normal++;
                }
            }
        }

        visited = new boolean[N][N];
        int colorWeak = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, map[i][j], true);
                    colorWeak++;
                }
            }
        }

        System.out.println(normal + " " + colorWeak);
    }

    static void dfs(int x, int y, char color, boolean isColorWeak) {
        visited[x][y] = true;

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            if (visited[nx][ny]) continue;

            if (isColorWeak) {
                if ((color == 'R' || color == 'G') && (map[nx][ny] == 'R' || map[nx][ny] == 'G')) {
                    dfs(nx, ny, color, true);
                } else if (color == 'B' && map[nx][ny] == 'B') {
                    dfs(nx, ny, color, true);
                }
            } else {
                if (map[nx][ny] == color) {
                    dfs(nx, ny, color, false);
                }
            }
        }
    }
}
