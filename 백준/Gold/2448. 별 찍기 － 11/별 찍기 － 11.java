import java.io.*;
import java.util.*;

public class Main {
    static char[][] star;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        star = new char[N][N * 2 - 1];

        for (char[] line : star) {
            Arrays.fill(line, ' ');
        }

        draw(N, 0, N - 1);

        for (int i = 0; i < N; i++) {
            bw.write(star[i]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static void draw(int n, int x, int y) {
        if (n == 3) {
            star[x][y] = '*';

            star[x + 1][y - 1] = '*';
            star[x + 1][y + 1] = '*';

            for (int i = 0; i < 5; i++) {
                star[x + 2][y - 2 + i] = '*';
            }
            return;
        }

        int half = n / 2;
        draw(half, x, y);
        draw(half, x + half, y - half);
        draw(half, x + half, y + half);
    }


}