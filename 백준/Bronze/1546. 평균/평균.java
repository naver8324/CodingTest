import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] subjects = new double[N];
        double average = 0;
        double highest = 0;

        for (int i = 0; i < N; i++) {
            subjects[i] = Double.parseDouble(st.nextToken());
            if (subjects[i] > highest) {
                highest = subjects[i];
            }
        }

        for (int i = 0; i < N; i++) {
            average += subjects[i] / highest * 100;
        }

        System.out.println(average/N);
    }
}