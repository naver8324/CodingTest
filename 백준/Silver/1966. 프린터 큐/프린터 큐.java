import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < caseCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int j = 0; j < N; j++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[] {j, priority});
                priorityQueue.offer(priority);
            }

            int order = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();

                if (current[1] == priorityQueue.peek()) {
                    priorityQueue.poll();
                    order++;
                    if (current[0] == M) {
                        sb.append(order).append("\n");
                        break;
                    }
                } else {
                    queue.offer(current);
                }
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}
