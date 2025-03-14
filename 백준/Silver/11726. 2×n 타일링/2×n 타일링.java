import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N < 3) {
            System.out.println(N);
            return;
        }

        int[] fibonacci = new int[N + 1];
        fibonacci[1] = 1;
        fibonacci[2] = 2;

        for (int i = 3; i <= N; i++) {
            fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % 10007;
        }

        System.out.println(fibonacci[N]);
    }
}
