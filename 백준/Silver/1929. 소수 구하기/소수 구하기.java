import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] A = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            A[i] = i;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i*i <= N; i++) {
            if (A[i] == 0) {
                continue;
            }

            for (int j = i+i; j <= N; j+=i) {
                A[j] = 0;
            }
        }

        for (int i = M; i <= N; i++) {
            if (A[i] != 0) {
                sb.append(A[i]).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}