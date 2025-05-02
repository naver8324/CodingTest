import java.util.Scanner;

public class Main {
    public static long power(long a, long b, long c) {
        if (b == 0) return 1;
        long half = power(a, b / 2, c);
        long result = (half * half) % c;
        if (b % 2 == 1) result = (result * a) % c;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        System.out.println(power(A, B, C));
    }
}
