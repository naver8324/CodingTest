import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        final int range = (123456 * 2) + 1;
        boolean[] isPrime = new boolean[range];
        int[] primeCount = new int[range];

        for (int i = 2; i < range; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < range; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < range; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i < range; i++) {
            primeCount[i] = primeCount[i - 1] + (isPrime[i] ? 1 : 0);
        }

        StringBuilder sb = new StringBuilder();
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            sb.append(primeCount[n * 2] - primeCount[n]).append("\n");
        }

        System.out.print(sb.toString());
    }
}