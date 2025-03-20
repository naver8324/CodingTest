import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(bfs(N, K));
    }

    private static int bfs(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[100001];

        Arrays.fill(visited, -1);
        queue.offer(N);
        visited[N] = 0;

        while (!queue.isEmpty()) {
            int pos = queue.poll();

            if (pos == K) {
                return visited[pos];
            }

            for (int nextPos : new int[]{pos - 1, pos + 1, pos * 2}) {
                if (nextPos >= 0 && nextPos <= 100000 && visited[nextPos] == -1) {
                    visited[nextPos] = visited[pos] + 1;
                    queue.add(nextPos);
                }
            }
        }
        return -1;
    }
}
