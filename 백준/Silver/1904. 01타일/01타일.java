import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N <= 2) {
            System.out.println(N);
            return;
        }

        int caseCount = 0;
        int prevPrev = 1;
        int prev = 2;

        for (int i = 3; i <= N; i++) {
            caseCount = (prev + prevPrev) % 15746;
            prevPrev = prev;
            prev = caseCount;
        }

        System.out.println(caseCount);
    }
}