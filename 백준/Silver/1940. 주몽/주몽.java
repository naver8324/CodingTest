import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] materials = new int[N];

        int start = 0;
        int end = N - 1;
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            materials[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(materials);

        while (start < end) {
            int sum = materials[start] + materials[end];
            if (sum == M) {
                count++;
                start++;
            } else if (sum > M) {
                end--;
            } else {
                start++;
            }
        }

        System.out.println(count);
    }
}