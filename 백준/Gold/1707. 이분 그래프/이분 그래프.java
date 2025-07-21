import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Integer>[] A;
    static int[] group;
    static int V, E;
    static boolean isBipartite;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            A = new ArrayList[V + 1];
            group = new int[V + 1];
            isBipartite = true;

            for (int j = 1; j <= V; j++) {
                A[j] = new ArrayList<>();
            }

            for (int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                A[u].add(v);
                A[v].add(u);
            }

            for (int j = 1; j <= V; j++) {
                if (group[j] == 0) {
                    DFS(j, 1);
                }
            }

            sb.append(isBipartite ? "YES" : "NO").append("\n");
        }

        System.out.print(sb.toString());
    }

    private static void DFS(int now, int color) {
        group[now] = color;

        for (int next : A[now]) {
            if (group[next] == 0) {
                DFS(next, -color);
            } else if(group[next] == color){
                isBipartite = false;
            }
        }
    }
}