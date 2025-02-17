import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                result++;
            } else {
                int temp = i;
                int n1 = temp % 10;
                temp /= 10;
                int n2 = temp % 10;
                temp /= 10;
                int n3 = temp % 10;

                if (n2 - n1 == n3 - n2) {
                    result++;
                }
            }
        }

        if (N == 1000) {
            result--;
        }

        System.out.println(result);
        br.close();
    }
}
