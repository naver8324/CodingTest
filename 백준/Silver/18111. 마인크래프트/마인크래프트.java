import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] land = new int[N][M];
        int min = 256;
        int max = 0;
        int time = Integer.MAX_VALUE;
        int height = -1;

        for (int x = 0; x < N; x++) {
            st = new StringTokenizer(br.readLine());

            for (int y = 0; y < M; y++) {
                int landHeight = Integer.parseInt(st.nextToken());
                land[x][y] = landHeight;
                min = Math.min(min, landHeight);
                max = Math.max(max, landHeight);
            }
        }

        for (int h = min; h <= max; h++) {
            int remove = 0;
            int add = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = land[i][j] - h;
                    if (diff > 0) {
                        remove += diff;
                    } else {
                        add -= diff;
                    }
                }
            }

            if (remove + B >= add) {
                int t = remove * 2 + add;

                if (t < time || (t == time && h > height)) {
                    time = t;
                    height = h;
                }
            }
        }

        System.out.println(time + " " + height);
    }
}
