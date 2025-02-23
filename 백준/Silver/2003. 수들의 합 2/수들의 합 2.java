import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int x = 0, y = 0;

        int[] prefixSum = new int[N];
        int currentSum = 0;
        prefixSum[0] = A[0];

        for (int i = 1; i < N; i++) {
            prefixSum[i] = A[i] + prefixSum[i - 1];
        }

        for (int i = 0; i < N; i++) {
            currentSum = prefixSum[i];

            while(currentSum >= M && x < N){
                if (currentSum == M) {
                    count++;
                    break;
                }
                if (currentSum - prefixSum[x] > M) {
                    x++;
                } else {
                    currentSum -= prefixSum[x];
                }
            }
        }

        System.out.println(count);
        br.close();
    }
}
