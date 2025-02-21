import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        int count = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(st.nextToken());

            int index = 0;
            for (int x : deque) {
                if (x == number) {
                    break;
                }
                index++;
            }

            int left = index;
            int right = deque.size() - index;

            if (left <= right) {
                for (int x = 0; x < left; x++) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            } else {
                for (int x = 0; x < right; x++) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }

            deque.poll();
        }

        System.out.println(count);
        br.close();
    }
}
