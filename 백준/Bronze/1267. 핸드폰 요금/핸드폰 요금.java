import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Y = 0;
        int M = 0;

        for (int i = 0; i < N; i++) {
            int callTime = Integer.parseInt(st.nextToken());
            Y += (((callTime / 30) + 1) * 10);
            M += (((callTime / 60) + 1) * 15);
        }

        System.out.println(Y == M ? "Y M " + Y : Y < M ? "Y " + Y : "M " + M);
        br.close();
    }
}
