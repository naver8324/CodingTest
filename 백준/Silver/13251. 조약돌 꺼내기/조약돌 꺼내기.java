import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pebblesByColor = new int[M];
        double sum = 0;
        for (int i = 0; i < M; i++) {
            pebblesByColor[i] = Integer.parseInt(st.nextToken());
            sum += pebblesByColor[i];
        }

        int K = Integer.parseInt(br.readLine());

        double totalProbability = 0.0;

        for (int i = 0; i < M; i++) {
            if (pebblesByColor[i] < K) {
                continue;
            }

            double sameColorProbability = 1.0;
            for (int j = 0; j < K; j++) {
                sameColorProbability *= (double) (pebblesByColor[i] - j) / (sum - j);

            }
            totalProbability += sameColorProbability;
        }

        System.out.println(totalProbability);
        br.close();
    }
}
