import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long count = 0;

        long[] prefixSum = new long[N];
        long[] indexCount = new long[M];

        prefixSum[0] = sc.nextInt();
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = sc.nextInt() + prefixSum[i - 1];
        }

        for (int i = 0; i < N; i++) {
            int remainder = (int)(prefixSum[i] % M);
            if (remainder == 0) {
                count++;
            }
            indexCount[remainder]++;
        }

        for (int i = 0; i < M; i++) {
            if (indexCount[i] > 1) {
                count += indexCount[i] * (indexCount[i] - 1) / 2;
            }
        }

        System.out.println(count);
    }
}