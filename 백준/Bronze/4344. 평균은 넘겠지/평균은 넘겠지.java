import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] students = new int[N];
            int sum = 0;

            for (int j = 0; j < N; j++) {
                students[j] = Integer.parseInt(st.nextToken());
                sum += students[j];
            }

            double avg = (double) sum / N;
            int count = 0;

            for (int n : students) {
                if (avg < n) {
                    count++;
                }
            }

            double percent = (double) count / N * 100;
            sb.append(String.format("%.3f%%\n", percent));
        }

        System.out.print(sb.toString());
    }
}