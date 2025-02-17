import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N < 100) {
            System.out.println(N);
            return;
        }

        int count = 99;

        for (int i = 111; i <= N; i++) {
            int temp = i;
            int n1 = temp % 10;
            temp /= 10;
            int n2 = temp % 10;
            temp /= 10;
            int n3 = temp % 10;

            if (n2 - n1 == n3 - n2) {
                count++;
            }
        }

        if (N == 1000) {
            count--;
        }

        System.out.println(count);
        br.close();
    }
}
