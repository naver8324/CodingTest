import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(Z(N, r, c));
    }

    private static int Z(int n, int r, int c) {
        if (n == 0) {
            return 0;
        }

        int half = 1 << (n - 1);
        int area = half * half;

        if (r < half && c < half) {
            return Z(n - 1, r, c);
        } else if (r < half) {
            return area + Z(n - 1, r, c - half);
        } else if (c < half) {
            return area * 2 + Z(n - 1, r - half, c);
        } else {
            return area * 3 + Z(n - 1, r - half, c - half);
        }
    }
}
