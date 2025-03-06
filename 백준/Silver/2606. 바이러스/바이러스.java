import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int virusCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        A = new ArrayList[computers + 1];
        visited = new boolean[computers + 1];

        for (int i = 1; i <= computers; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);

        }

        DFS(1);

        System.out.println(--virusCount);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        virusCount++;

        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}