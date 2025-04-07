import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] room = new char[N][N];

        int width = 0;
        int height = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                room[i][j] = input.charAt(j);
            }
        }



        for (int i = 0; i < N; i++) {
            int widthCount = 0;
            int heightCount = 0;

            for (int j = 0; j < N; j++) {
                if (room[i][j] == '.') {
                    widthCount++;
                } else {
                    if (widthCount >= 2) {
                        width++;
                    }
                    widthCount = 0;
                }

                if (room[j][i] == '.') {
                    heightCount++;
                } else {
                    if (heightCount >= 2) {
                        height++;
                    }
                    heightCount = 0;
                }
            }
            if (widthCount >= 2) width++;
            if (heightCount >= 2) height++;
        }



        System.out.println(width + " " + height);
    }
}