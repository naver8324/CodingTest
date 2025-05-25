import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;

            for (int a = 0; a < n; a++) {
                for (int b = 1 + a; b < n; b++) {
                    sum += GCD(arr[a], arr[b]);
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static int GCD(int a, int b) {
        int temp = 0;

        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}