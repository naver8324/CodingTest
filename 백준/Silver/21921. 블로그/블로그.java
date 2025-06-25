import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] visitors = new int[N];

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            visitors[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = X, max = 0, sum = 0, count = 1;

        for (int i = 0; i < X; i++) {
            sum += visitors[i];
        }

        max = sum;

        for (int i = 0; i < N - X; i++) {
            sum -= visitors[start++];
            sum += visitors[end++];

            if (sum > max) {
                count = 1;
                max = sum;
            } else if (sum == max) {
                count++;
            }
        }

        if (max == 0) {
            System.out.println("SAD");
            return;
        }

        sb.append(max).append("\n");
        sb.append(count);

        System.out.println(sb.toString());
    }
}