import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] numbers;
    static int[] ops;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        ops = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            ops[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, numbers[0], ops[0], ops[1], ops[2], ops[3]);

        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int i, int current, int plus, int minus, int mul, int div) {
        if (i == N) {
            max = Math.max(max, current);
            min = Math.min(min, current);
            return;
        }

        int next = numbers[i];

        if (plus > 0) {
            dfs(i + 1, current + next, plus - 1, minus, mul, div);
        }
        if (minus > 0) {
            dfs(i + 1, current - next, plus, minus - 1, mul, div);
        }
        if (mul > 0) {
            dfs(i + 1, current * next, plus, minus, mul - 1, div);
        }
        if (div > 0) {
            dfs(i + 1, divde(current, next), plus, minus, mul, div - 1);
        }
    }

    private static int divde(int a, int b) {
        if (a < 0) {
            return -(-a / b);
        }
        return a / b;
    }
}
