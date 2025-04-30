import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            char[] command = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            Deque<Integer> deque = new LinkedList<>();
            boolean isReverse = false;
            boolean isError = false;

            if (n > 0) {
                String[] nums = input.substring(1, input.length() - 1).split(",");
                for (String num : nums) {
                    deque.offer(Integer.parseInt(num));
                }
            }

            for (char c : command) {
                if (c == 'R') {
                    isReverse = !isReverse;
                } else {
                    if (deque.isEmpty()) {

                        isError = true;
                        break;
                    }
                    if (isReverse) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            if (isError) {
                sb.append("error").append("\n");
            } else {
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append(isReverse ? deque.pollLast() : deque.pollFirst());

                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]").append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}