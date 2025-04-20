import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String commands = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();

            Deque<Integer> deque = new ArrayDeque<>();
            boolean isReversed = false;
            boolean isError = false;

            if (n > 0) {
                String[] nums = input.substring(1, input.length() - 1).split(",");
                for (String num : nums) {
                    deque.add(Integer.parseInt(num));
                }
            }

            for (char cmd : commands.toCharArray()) {
                if (cmd == 'R') {
                    isReversed = !isReversed;
                } else if (cmd == 'D') {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReversed) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            if (isError) {
                output.append("error\n");
            } else {
                output.append("[");
                while (!deque.isEmpty()) {
                    output.append(isReversed ? deque.pollLast() : deque.pollFirst());
                    if (!deque.isEmpty()) output.append(",");
                }
                output.append("]\n");
            }
        }

        System.out.print(output.toString());
    }
}
