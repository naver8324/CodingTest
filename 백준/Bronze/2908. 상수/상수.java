import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int reverseA = 0;
        int reverseB = 0;

        for (int i = 0; i < 3; i++) {
            reverseA *= 10;
            reverseA += A % 10;
            A /= 10;

            reverseB *= 10;
            reverseB += B % 10;
            B /= 10;
        }

        System.out.println(Math.max(reverseA, reverseB));
    }
}