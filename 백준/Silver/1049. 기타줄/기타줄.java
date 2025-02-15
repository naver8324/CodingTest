import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int minPackagePrice = Integer.MAX_VALUE;
        int minSinglePrice = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int packagePrice = Integer.parseInt(st.nextToken());
            int singlePrice = Integer.parseInt(st.nextToken());

            minPackagePrice = Math.min(minPackagePrice, packagePrice);
            minSinglePrice = Math.min(minSinglePrice, singlePrice);
        }

        int cost1 = ((N / 6) + 1) * minPackagePrice;
        int cost2 = N * minSinglePrice;
        int cost3 = (N / 6) * minPackagePrice + (N % 6) * minSinglePrice;

        System.out.println(Math.min(cost1, Math.min(cost2, cost3)));
        br.close();
    }
}
