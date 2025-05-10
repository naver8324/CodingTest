import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] maxDp = new int[2][3];
        int[][] minDp = new int[2][3];

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int prev = (i + 1) % 2;
            int curr = i % 2;

            maxDp[curr][0] = Math.max(maxDp[prev][0], maxDp[prev][1]) + a;
            maxDp[curr][1] = Math.max(Math.max(maxDp[prev][0], maxDp[prev][1]), maxDp[prev][2]) + b;
            maxDp[curr][2] = Math.max(maxDp[prev][1], maxDp[prev][2]) + c;

            minDp[curr][0] = Math.min(minDp[prev][0], minDp[prev][1]) + a;
            minDp[curr][1] = Math.min(Math.min(minDp[prev][0], minDp[prev][1]), minDp[prev][2]) + b;
            minDp[curr][2] = Math.min(minDp[prev][1], minDp[prev][2]) + c;
        }

        int last = (N - 1) % 2;
        int maxResult = Math.max(Math.max(maxDp[last][0], maxDp[last][1]), maxDp[last][2]);
        int minResult = Math.min(Math.min(minDp[last][0], minDp[last][1]), minDp[last][2]);

        System.out.println(maxResult + " " + minResult);
    }
}
