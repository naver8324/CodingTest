import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static int[] selected;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];
        arr = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        backtrack(0);

        System.out.print(sb.toString());
    }

    private static void backtrack(int depth) {
        if (depth == M) {
            for (int n : selected) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        int prev = -1;

        for (int i = 0; i < N; i++) {
            if (!visited[i] && prev != arr[i]) {
                prev = arr[i];
                visited[i] = true;
                selected[depth] = arr[i];
                backtrack(depth+1);
                visited[i] = false;
            }
        }
    }
}