import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] S = new int[L];

        for (int i = 0; i < L; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(S);

        int n = Integer.parseInt(br.readLine());

        int prev = 0;
        int next = 0;

        for (int s : S) {
            if (s < n) {
                prev = s;
            } else if (s > n) {
                next = s;
                break;
            } else {
                System.out.println(0);
                return;
            }
        }

        int count = 0;
        for (int a = prev + 1; a <= n; a++) {
            for (int b = n; b < next; b++) {
                if (a < b) count++;
            }
        }

        System.out.println(count);
    }
}
