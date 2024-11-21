import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] sieve = new boolean[N + 1];
        
        sieve[1] = true; // 1의 소수가 아니므로 예외적을 처리

        for (int i = 2; i * i <= N; i++) {
            if (!sieve[i]) {
                for (int j = i * i; j <= N; j += i) {
                    if (!sieve[j]) {
                        sieve[j] = true;
                    }
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (!sieve[i]) {
                System.out.println(i);
            }
        }

        br.close();
    }
}
