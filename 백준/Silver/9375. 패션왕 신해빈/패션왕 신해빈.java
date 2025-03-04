import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                sb.append(0).append("\n");
                continue;
            }

            Map<String, Integer> dresses = new HashMap<>();

            for (int j = 0; j < N; j++) {
                String[] dress = br.readLine().split(" ");
                dresses.put(dress[1], dresses.getOrDefault(dress[1], 0) + 1);
            }

            int count = 1;

            for (String category : dresses.keySet()) {
                count *= dresses.get(category) + 1;
            }
            sb.append(--count).append("\n");
        }

        System.out.print(sb.toString());
    }
}