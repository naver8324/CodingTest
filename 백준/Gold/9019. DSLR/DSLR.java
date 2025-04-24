import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bfs(A, B);
        }

        System.out.print(sb.toString());
    }

    private static void bfs(int A, int B) {
        boolean[] visited = new boolean[10000];
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(A, null, ' '));
        visited[A] = true;

        Pair end = null;

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int num = p.num;

            if (num == B) {
                end = p;
                break;
            }

            int D = (num * 2) % 10000;
            int S = num == 0 ? 9999 : num - 1;
            int L = (num * 10 + num / 1000) % 10000;
            int R = num / 10 + num % 10 * 1000;

            if (!visited[D]) {
                visited[D] = true;
                queue.offer(new Pair(D, p, 'D'));
            }
            if (!visited[S]) {
                visited[S] = true;
                queue.offer(new Pair(S, p, 'S'));
            }
            if (!visited[L]) {
                visited[L] = true;
                queue.offer(new Pair(L, p, 'L'));
            }
            if (!visited[R]) {
                visited[R] = true;
                queue.offer(new Pair(R, p, 'R'));
            }
        }

        StringBuilder path = new StringBuilder();
        while (end != null && end.prev != null) {
            path.append(end.command);
            end = end.prev;
        }
        sb.append(path.reverse().toString()).append("\n");
    }
}

class Pair {
    int num;
    Pair prev;
    char command;

    Pair(int num, Pair prev, char command) {
        this.num = num;
        this.prev = prev;
        this.command = command;
    }
}
