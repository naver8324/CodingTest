import java.util.Scanner;

public class Main {
    public static int findYear(int M, int N, int x, int y) {
        int maxYear = lcm(M, N);
        for (int i = 0; i <= maxYear / M; i++) {
            int year = i * M + x;
            if ((year - 1) % N + 1 == y) {
                return year;
            }
        }
        return -1;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(findYear(M, N, x, y));
        }
    }
}
