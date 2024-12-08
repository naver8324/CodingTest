import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] data = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            data[i][0] = Integer.parseInt(st.nextToken());
            data[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] rank = new int[N];
        for (int i = 0; i < N; i++) {
            rank[i] = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (data[i][0] < data[j][0] && data[i][1] < data[j][1]) {
                    rank[i]++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : rank) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
        br.close();
    }
}
