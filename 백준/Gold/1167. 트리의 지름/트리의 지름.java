import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Edge>[] A;
    static int[] distance;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        A = new ArrayList[V + 1];

        for (int i = 1; i <= V; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            while (true) {
                int e = Integer.parseInt(st.nextToken());
                if (e == -1) {
                    break;
                }
                int distance = Integer.parseInt(st.nextToken());

                A[n].add(new Edge(e, distance));
            }
        }

        distance = new int[V + 1];
        visited = new boolean[V + 1];

        BFS(1);

        int max = 1;
        for (int i = 2; i <= V; i++) {
            if (distance[max] < distance[i]) {
                max = i;
            }
        }

        distance = new int[V + 1];
        visited = new boolean[V + 1];

        BFS(max);

        max = distance[1];
        for (int i = 2; i <= V; i++) {
            if (max < distance[i]) {
                max = distance[i];
            }
        }

        System.out.println(max);
    }

    private static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(index);
        visited[index] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (Edge edge : A[now]) {
                int e = edge.e;
                int v = edge.v;

                if (!visited[e]) {
                    visited[e] = true;
                    queue.offer(e);
                    distance[e] = distance[now] + v;
                }
            }
        }
    }
}

class Edge{
    int e;
    int v;

    public Edge(int e, int v) {
        this.e = e;
        this.v = v;
    }
}