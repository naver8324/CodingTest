import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Node>[] graph;
    static boolean[] visited;
    static long[] numerator;
    static long[] denominator;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N];
        visited = new boolean[N];
        numerator = new long[N];
        denominator = new long[N];

        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            graph[a].add(new Node(b, p, q));
            graph[b].add(new Node(a, q, p));
        }

        numerator[0] = 1;
        denominator[0] = 1;
        dfs(0);

        long lcm = denominator[0];
        for (int i = 1; i < N; i++) {
            lcm = lcm(lcm, denominator[i]);
        }

        long[] result = new long[N];
        for (int i = 0; i < N; i++) {
            result[i] = numerator[i] * (lcm / denominator[i]);
        }

        long mgcd = result[0];
        for (int i = 1; i < N; i++) {
            mgcd = gcd(mgcd, result[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i] / mgcd).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static void dfs(int now) {
        visited[now] = true;
        for (Node next : graph[now]) {
            if (!visited[next.b]) {
                numerator[next.b] = numerator[now] * next.q;
                denominator[next.b] = denominator[now] * next.p;

                long g = gcd(numerator[next.b], denominator[next.b]);
                numerator[next.b] /= g;
                denominator[next.b] /= g;

                dfs(next.b);
            }
        }
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    static class Node {
        int b;
        int p, q;
        Node(int b, int p, int q) {
            this.b = b;
            this.p = p;
            this.q = q;
        }
    }
}
