import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] box = new int[N][M];

        int unripeTomatoes = 0;
        int ripeTomatoes = 0;
        int totalTomatoes = M * N;
        Queue<int[]> queue = new LinkedList<>();

        int[] dy = {1, -1, 0, 0};
        int[] dx = {0, 0, 1, -1};

        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());

            for (int m = 0; m < M; m++) {
                int tomato = Integer.parseInt(st.nextToken());
                box[n][m] = tomato;

                if (tomato == 1) {
                    ripeTomatoes++;
                    queue.offer(new int[]{n, m});
                } else if (tomato == 0) {
                    unripeTomatoes++;
                } else {
                    totalTomatoes--;
                }
            }
        }

        int minDay = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                int[] cur = queue.poll();
                int y = cur[0], x = cur[1];

                for (int i = 0; i < 4; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];

                    if (ny >= 0 && nx >= 0 && ny < N && nx < M) {
                        if (box[ny][nx] == 0) {
                            box[ny][nx] = 1;
                            ripeTomatoes++;
                            queue.offer(new int[]{ny, nx});
                        }
                    }
                }
            }
            minDay++;
        }

        if (unripeTomatoes == 0) {
            System.out.println(0);
        } else if (totalTomatoes == ripeTomatoes) {
            System.out.println(minDay);
        } else {
            System.out.println(-1);
        }
    }
}
