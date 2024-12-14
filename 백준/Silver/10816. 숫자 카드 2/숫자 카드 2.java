import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> cardCounts = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(st.nextToken());
            sb.append(cardCounts.getOrDefault(number, 0)).append(" ");
        }

        System.out.println(sb.toString());
        br.close();
    }
}
