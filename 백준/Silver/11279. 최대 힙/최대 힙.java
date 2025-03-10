import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return - Integer.compare(o1, o2);
            }
        });
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                sb.append(maxHeap.isEmpty() ? 0 : maxHeap.poll()).append("\n");
            } else {
                maxHeap.add(input);
            }
        }

        System.out.print(sb.toString());
    }
}