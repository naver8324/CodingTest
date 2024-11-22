import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static boolean isFound = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        A = new ArrayList[N];

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            A[b].add(a);
        }

        for (int i = 0; i < N; i++) {
            if (!isFound) {
                DFS(i, 1);
            }
        }

        System.out.println(isFound ? 1 : 0);

        br.close();
    }

    private static void DFS(int n, int depth) {
        if (depth == 5) {
            isFound = true;
            return;
        }

        visited[n] = true;

        for (int i : A[n]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
            }
        }

        visited[n] = false;
    }
}