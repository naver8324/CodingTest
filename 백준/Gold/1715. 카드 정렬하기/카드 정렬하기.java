import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int result = 0;

        while (pq.size() > 1) {
            int A = pq.poll();
            int B = pq.poll();

            int sum = 0;
            sum = A + B;
            pq.offer(sum);
            result += sum;
        }

        System.out.println(result);
    }
}