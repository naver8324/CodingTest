import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        List<int[]> emptySpace = new ArrayList<>();

        for (int x = 0; x < N; x++) {
            st = new StringTokenizer(br.readLine());

            for (int y = 0; y < M; y++) {
                map[x][y] = Integer.parseInt(st.nextToken());

                if (map[x][y] == 0) {
                    emptySpace.add(new int[]{x, y});
                }
            }
        }

        int maxSafeArea = 0;

        for (int i = 0; i < emptySpace.size(); i++) {
            for (int j = i + 1; j < emptySpace.size(); j++) {
                for (int k = j + 1; k < emptySpace.size(); k++) {
                    int[][] tempMap = new int[N][M];

                    for (int v = 0; v < N; v++) {
                        tempMap[v] = map[v].clone();
                    }

                    int[] a = emptySpace.get(i);
                    int[] b = emptySpace.get(j);
                    int[] c = emptySpace.get(k);

                    tempMap[a[0]][a[1]] = 1;
                    tempMap[b[0]][b[1]] = 1;
                    tempMap[c[0]][c[1]] = 1;

                    spreadVirus(tempMap);

                    maxSafeArea = Math.max(maxSafeArea, getSafeArea(tempMap));
                }
            }
        }

        System.out.println(maxSafeArea);
    }

    private static int getSafeArea(int[][] tempMap) {
        int count = 0;

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                if (tempMap[x][y] == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    private static void spreadVirus(int[][] tempMap) {
        Queue<int[]> queue = new LinkedList<>();

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                if (tempMap[x][y] == 2) {
                    queue.offer(new int[]{x, y});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (tempMap[nx][ny] == 0) {
                        tempMap[nx][ny] = 2;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}