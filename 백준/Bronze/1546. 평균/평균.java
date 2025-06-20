import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double average = 0;
        double highest = 0;

        for (int i = 0; i < N; i++) {
            double n = Double.parseDouble(st.nextToken());
            average += n;

            if (n > highest) {
                highest = n;
            }
        }

        System.out.println(average * 100 / N / highest);
    }
}