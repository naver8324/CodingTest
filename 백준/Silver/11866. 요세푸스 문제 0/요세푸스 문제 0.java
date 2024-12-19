import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int i = 1;
        while (!queue.isEmpty()) {
            if (i % K == 0 && queue.peek() != null) {
                sb.append(queue.size() == 1 ? queue.poll() : queue.poll() + ", ");
            } else {
                queue.offer(queue.poll());
            }
            i++;
        }

        sb.append(">");
        System.out.println(sb.toString());
        br.close();
    }
}
