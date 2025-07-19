import java.io.*;
import java.util.*;

class Main{
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);

        System.out.print(sb.toString());
    }

    private static void DFS(int n, int digitCount) {
        if (!isPrime(n)) {
            return;
        }

        if (digitCount == N) {
            sb.append(n).append("\n");
        } else {
            for (int i = 1; i <= 9; i += 2) {
                DFS(n * 10 + i, digitCount + 1);
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}