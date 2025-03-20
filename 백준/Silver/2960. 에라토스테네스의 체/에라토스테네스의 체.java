import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= N; i++) {
            for (int x = i; x <= N; x += i) {
                if (arr[x] == 0) {
                    continue;
                }

                arr[x] = 0;
                K--;

                if (K == 0) {
                    System.out.println(x);
                    return;
                }
            }
        }

    }
}
