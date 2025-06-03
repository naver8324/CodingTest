import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        final int MOD = 9901;

        int a = 1;
        int b = 1;
        int c = 1;

        for (int i = 1; i < N; i++) {
            int A = (a + b + c) % MOD;
            int B = (a + c) % MOD;
            int C = (a + b) % MOD;

            a = A;
            b = B;
            c = C;
        }

        System.out.println((a + b + c) % MOD);
    }
}