import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] X = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedX = X.clone();
        Arrays.sort(sortedX);

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int n : sortedX) {
            if (!map.containsKey(n)) {
                map.put(n, index++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int n : X) {
            sb.append(map.get(n)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
