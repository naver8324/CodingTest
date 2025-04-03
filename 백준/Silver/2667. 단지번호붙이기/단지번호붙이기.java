import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] grid;
    static boolean[][] visited;
    static List<Integer> complexSizes;
    static int count;

    // 상, 하, 좌, 우 방향 이동을 위한 배열
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];
        visited = new boolean[N][N];
        complexSizes = new ArrayList<>();

        for (int x = 0; x < N; x++) {
            String line = br.readLine();
            for (int y = 0; y < N; y++) {
                grid[x][y] = line.charAt(y) - '0';
            }
        }

        findComplexes();

        Collections.sort(complexSizes);

        StringBuilder sb = new StringBuilder();
        sb.append(complexSizes.size()).append("\n");
        
        for (int size : complexSizes) {
            sb.append(size).append("\n");
        }

        System.out.print(sb);
    }

    static void findComplexes() {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (grid[x][y] == 1 && !visited[x][y]) {
                    count = 0;
                    dfs(x, y);
                    complexSizes.add(count);
                }
            }
        }
    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        count++;

        for(int d=0; d<4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N){
                if(!visited[nx][ny] && grid[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }
        
    }
}
