import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[][][] box = new int[H][N][M];


        int unripeTomatoes = 0;
        int ripeTomatoes = 0;
        int totalTomatoes = M * N * H;
        Queue<int[]> queue = new LinkedList<>();

        int[] dz = {1, -1, 0, 0, 0, 0};
        int[] dy = {0, 0, 1, -1, 0, 0};
        int[] dx = {0, 0, 0, 0, 1, -1};

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    int tomato = Integer.parseInt(st.nextToken());
                    box[h][n][m] = tomato;

                    if (tomato == 1) {
                        queue.offer(new int[]{h, n, m});
                        ripeTomatoes++;
                    } else if (tomato == 0) {
                        unripeTomatoes++;
                    } else {
                        totalTomatoes--;
                    }
                }
            }
        }

        int minDay = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                int[] cur = queue.poll();
                int z = cur[0], y = cur[1], x = cur[2];


                for (int i = 0; i < 6; i++) {
                    int nz = z + dz[i];
                    int ny = y + dy[i];
                    int nx = x + dx[i];

                    if (nz >= 0 && ny >= 0 && nx >= 0 && nz < H && ny < N && nx < M) {
                        if (box[nz][ny][nx] == 0) {
                            box[nz][ny][nx] = box[nz][ny][nx] + 1;
                            ripeTomatoes++;
                            queue.offer(new int[]{nz, ny, nx});
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
