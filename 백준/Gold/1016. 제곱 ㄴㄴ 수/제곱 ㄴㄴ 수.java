import java.io.*;
import java.util.*;

public class Main {
    static long min, max;
    static boolean[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        min = Long.parseLong(st.nextToken());
        max = Long.parseLong(st.nextToken());

        A = new boolean[(int) (max - min + 1)];

        squareNoNo();

        int count = 0;
        for (boolean check : A) {
            if (!check) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static void squareNoNo() {
        for (long i = 2; i * i <= max; i++) {
            long pow = i * i;
            long startIndex = min / pow;

            if (min % pow != 0) {
                startIndex++;
            }

            for (long j = startIndex; j * pow <= max; j++) {
                A[(int) (j * pow - min)] = true;
            }
        }
    }
}