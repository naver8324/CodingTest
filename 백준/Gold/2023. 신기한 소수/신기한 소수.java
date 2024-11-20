import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();


        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);

        writer.flush();

        writer.close();
        sc.close();
    }

    private static boolean isPrime(int prime) {
        if (prime == 2) {
            return true;
        }

        if (prime % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= prime; i += 2) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void DFS(int n, int numDigits) throws IOException {
        if (numDigits == N) {
            if (isPrime(n)) {
                writer.write(String.valueOf(n) + "\n");
            }
            return;
        }

        for (int i = 1; i < 10; i++) {
            if (isPrime(n * 10 + i)) {
                DFS(n * 10 + i, numDigits + 1);
            }
        }
    }
}
