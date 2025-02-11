import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int ENow = 1, SNow = 1, MNow = 1;
        int year = 1;

        while (true) {
            if (ENow == 16) {
                ENow = 1;
            }
            if (SNow == 29) {
                SNow = 1;
            }
            if (MNow == 20) {
                MNow = 1;
            }

            if (E == ENow && S == SNow && M == MNow) {
                break;
            }

            year++; ENow++; SNow++; MNow++;
        }

        System.out.println(year);
        br.close();
    }
}
