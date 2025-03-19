import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] papers;
    static int whitePaper;
    static int bluePaper;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        papers = new int[N][N];


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                papers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        check(0, 0, N);

        System.out.println(whitePaper);
        System.out.println(bluePaper);
    }

    private static void check(int startX, int startY, int size) {
        if (isOneColor(startX, startY, size)) {
            if (papers[startX][startY] == 0) {
                whitePaper++;
            } else {
                bluePaper++;
            }
            return;
        }

        int newSize = size / 2;
        check(startX, startY, newSize);
        check(startX + newSize, startY, newSize);
        check(startX, startY + newSize, newSize);
        check(startX + newSize, startY + newSize, newSize);
    }

    private static boolean isOneColor(int startX, int startY, int size) {
        int color = papers[startX][startY];

        for (int x = startX; x < startX + size; x++) {
            for (int y = startY; y < startY + size; y++) {
                if (color != papers[x][y]) {
                    return false;
                }
            }
        }

        return true;
    }

}
