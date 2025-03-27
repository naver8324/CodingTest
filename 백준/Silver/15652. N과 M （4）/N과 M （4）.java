import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];
        backtrack(0, 1);
        System.out.print(sb);
    }

    static void backtrack(int depth, int start) {
        if (depth == M) {
            for (int num : selected) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            selected[depth] = i;
            backtrack(depth + 1, i);
        }
    }
}