import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

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

        for (int prime : sieve) {
            if (prime == 0) {
                continue;
            }

            if (prime >= N) {
                if (palindrome(prime)) {
                    System.out.println(prime);
                    return;
                }
            }
        }
    }

    private static boolean palindrome(int prime) {
        char[] check = Integer.toString(prime).toCharArray();
        int j = check.length - 1;
        
        for (int i = 0; i < check.length/2; i++, j--) {
            if (check[i] != check[j]) {
                return false;
            }
        }

        return true;
    }
}