import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] prefixSum = new int[N + 1];
        long[] C = new long[M];
        long result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = (Integer.parseInt(st.nextToken()) + prefixSum[i - 1]) % M;
            if (prefixSum[i] == 0) {
                result++;
            }
            C[prefixSum[i]]++;
        }

        for (int i = 0; i < M; i++) {
            result += C[i] * (C[i] - 1) / 2;
        }

        System.out.println(result);
    }
}