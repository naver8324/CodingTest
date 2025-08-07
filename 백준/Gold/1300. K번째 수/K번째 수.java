import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int start = 1;
        int end = k;
        int result = 0;

        while (start <= end) {
            int middle = (start + end) / 2;
            int count = 0;

            for (int i = 1; i <= N; i++) {
                count += Math.min(N, middle / i);
            }

            if (count < k) {
                start = middle + 1;
            } else {
                end = middle - 1;
                result = middle;
            }
        }

        System.out.println(result);
    }
}