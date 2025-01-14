import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int questionNumber = Integer.parseInt(st.nextToken());
        long[] factorial = new long[N + 1];
        int[] result = new int[N + 1];
        boolean[] visited = new boolean[N + 1];

        factorial[0] = 1;
        for (int i = 1; i <= N; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        if (questionNumber == 1) {
            long k = Long.parseLong(st.nextToken());
            for (int i = 1; i <= N; i++) {
                for (int j = 1, cnt = 1; j <= N; j++) {
                    if (visited[j]) continue;
                    if (k <= cnt * factorial[N - i]) {
                        k -= ((cnt - 1) * factorial[N - i]);
                        result[i] = j;
                        visited[j] = true;
                        break;
                    }
                    cnt++;
                }
            }
            for (int i = 1; i <= N; i++) {
                sb.append(result[i]).append(" ");
            }
        } else {
            long k = 1;
            for (int i = 1; i <= N; i++) {
                result[i] = Integer.parseInt(st.nextToken());
                long cnt = 0;
                for (int j = 1; j < result[i]; j++) {
                    if (!visited[j]) cnt++;
                }
                k += cnt * factorial[N - i];
                visited[result[i]] = true;
            }
            sb.append(k);
        }

        System.out.println(sb.toString());
        br.close();
    }
}
