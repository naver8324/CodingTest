import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int[] sieve = new int[10_000_001];

        for (int i = 2; i <= 10_000_000; i++) {
            sieve[i] = i;
        }

        for (int i = 2; i * i <= 10_000_000; i++) {
            if (sieve[i] == 0) {
                continue;
            }

            for (int j = i + i; j <= 10_000_000; j += i) {
                sieve[j] = 0;
            }
        }

        int count = 0;

        for (int prime : sieve) {
            if (prime == 0) {
                continue;
            }

            long temp = (long) prime;

            while (temp <= B / prime) {
                temp *= prime;

                if (temp >= A) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}