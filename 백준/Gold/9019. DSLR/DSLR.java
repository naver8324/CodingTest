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

            BFS(A, B);
        }

        System.out.print(sb.toString());
    }

    private static void BFS(int A, int B) {
        boolean[] visited = new boolean[10000];
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(A, ""));
        visited[A] = true;

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int num = p.num;
            String command = p.command;

            if (num == B) {
                sb.append(command).append("\n");
                return;
            }
            int D = (num * 2) % 10000;
            int S = num == 0 ? 9999 : num - 1;
            int L = (num * 10 + num / 1000) % 10000;
            int R = num / 10 + num % 10 * 1000;

            if (!visited[D]){
                visited[D] = true;
                queue.offer(new Pair(D, command + "D"));
            }
            if (!visited[S]) {
                visited[S] = true;
                queue.offer(new Pair(S, command + "S"));
            }
            if (!visited[L]) {
                visited[L] = true;
                queue.offer(new Pair(L, command + "L"));
            }
            if (!visited[R]) {
                visited[R] = true;
                queue.offer(new Pair(R, command + "R"));
            }
        }
    }
}


class Pair {
    int num;
    String command;

    Pair(int A, String S) {
        this.num = A;
        this.command = S;
    }
}