import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(calculate(k, n)+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    private static int calculate(int k, int n) {
        if (k == 0) {
            return n;
        }
        if (n == 1) {
            return 1;
        }

        return calculate(k - 1, n) + calculate(k, n - 1);
    }
}
