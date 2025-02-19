import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        sb.append("<");
        int i = 1;
        while (queue.size() != 1) {
            if (i % K == 0) {
                sb.append(queue.poll()).append(", ");
            } else {
                queue.add(queue.poll());
            }
            i++;
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb.toString());
        br.close();
    }
}
