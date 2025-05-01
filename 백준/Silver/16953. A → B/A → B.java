import java.util.*;
import java.io.*;

public class Main {
    static Long A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.println(BFS());
    }

    private static long BFS() {
        Queue<long[]> queue = new LinkedList<>();
        Set<Long> visited = new HashSet<>();

        queue.offer(new long[]{A, 1});
        visited.add(A);

        while (!queue.isEmpty()) {
            long[] n = queue.poll();

            long num = n[0];
            long steps = n[1];

            if (num == B) {
                return steps;
            }

            long n1 = num * 2;
            long n2 = (num * 10) + 1;

            if (n1 <= B && visited.add(n1)) {
                queue.offer(new long[]{n1, steps + 1});
            }

            if (n2 <= B && visited.add(n2)) {
                queue.offer(new long[]{n2, steps+1});
            }
        }

        return -1;
    }
}