import java.util.Scanner;

public class Main {
    static int N;
    static int[] numbers;
    static int[] operators = new int[4];
    static int maxValue = Integer.MIN_VALUE;
    static int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        dfs(1, numbers[0]);

        System.out.println(maxValue);
        System.out.println(minValue);
    }

    static void dfs(int index, int current) {
        if (index == N) {
            maxValue = Math.max(maxValue, current);
            minValue = Math.min(minValue, current);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                if (i == 0) {
                    dfs(index + 1, current + numbers[index]);
                } else if (i == 1) {
                    dfs(index + 1, current - numbers[index]);
                } else if (i == 2) {
                    dfs(index + 1, current * numbers[index]);
                } else if (i == 3) {
                    dfs(index + 1, divide(current, numbers[index]));
                }

                operators[i]++;
            }
        }
    }

    static int divide(int a, int b) {
        if (a < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
