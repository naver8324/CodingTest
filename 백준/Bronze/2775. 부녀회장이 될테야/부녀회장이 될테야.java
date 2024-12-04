import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        int[][] apartment = new int[15][15];

        for (int i = 1; i < 15; i++) {
            apartment[0][i] = i;
        }
        for (int k = 1; k < 15; k++) {
            apartment[k][1] = 1;
            for (int n = 2; n < 15; n++) {
                apartment[k][n] = apartment[k - 1][n] + apartment[k][n - 1];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(apartment[k][n]+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
